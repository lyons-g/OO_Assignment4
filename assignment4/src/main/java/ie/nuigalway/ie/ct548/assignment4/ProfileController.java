package ie.nuigalway.ie.ct548.assignment4;

public class ProfileController {

	
	private Profile model;
	private ProfileSelectionView view;
	
	public ProfileController(Profile m, ProfileSelectionView v) {
		model = m;
		view = v;
		initView();
	}
	
	public void initView() {
		view.getProfile1Button().setText(model.getName());
		view.getProfile2Button().setText(model.getName());
		view.getProfile3Button().setText(model.getName());
		view.getProfile4Button().setText(model.getName());
		
		
	}
}
