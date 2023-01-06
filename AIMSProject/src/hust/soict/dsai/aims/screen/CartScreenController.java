package hust.soict.dsai.aims.screen;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class CartScreenController {
	
	private Cart cart;
	private Store store;
	
	@FXML
    private TableView<Media> tblMedia;
	
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Label totalCost;
    
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Label playingMedia;
    
    @FXML
    private Button btnStop;
    
    @FXML
    private Button btnOrder;
    
    @FXML
    private Label orderDone;
    
    public CartScreenController(Cart cart, Store store) {
		super();
		this.cart = cart;
		this.store = store;
	}
    

    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if (media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}else {
    		btnPlay.setVisible(false);
    	}
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("title"));
    
    	colMediaCategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemOrdered());
    	totalCost.setText(this.cart.totalCost()+"$");
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	playingMedia.setVisible(false);
    	orderDone.setVisible(false);
    	btnStop.setVisible(false);
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
    				
    				@Override
    				public void changed(ObservableValue<? extends Media> observable, Media oldValue,
    									Media newValue) {
    					if(newValue != null) {
    						updateButtonBar(newValue);
    					}
    					totalCost.setText(cart.totalCost()+"$");
    				}
    			});
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	playingMedia.setText("Playing "+media.getTitle()+"....");
    	playingMedia.setVisible(true);
    	btnStop.setVisible(true);
    }
    
    @FXML
    void btnStopPressed(ActionEvent event) {
    	playingMedia.setVisible(false);
    	btnStop.setVisible(false);
    }
    
    @FXML
    void btnViewStore(ActionEvent event) {
    	new StoreScreen(store, cart);
    }
    
    @FXML
    void btnOrderPressed(ActionEvent event) {
    	System.out.println("Order");
    	orderDone.setText("Order successfully!");
    	orderDone.setVisible(true);
    	cart.getItemOrdered().removeAll(cart.getItemOrdered());
    	totalCost.setText("0.0$");	
    }
}