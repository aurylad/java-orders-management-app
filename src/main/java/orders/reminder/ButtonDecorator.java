package orders.reminder;

public abstract class ButtonDecorator implements Button {
	   protected Button decoratedButton;

	   public ButtonDecorator(Button decoratedButton){
	      this.decoratedButton = decoratedButton;
	   }

	   public void setButton(){
	      decoratedButton.setButton();
	   }	
	}