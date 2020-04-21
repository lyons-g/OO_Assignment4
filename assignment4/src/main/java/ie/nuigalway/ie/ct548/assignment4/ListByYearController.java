package ie.nuigalway.ie.ct548.assignment4;

public class ListByYearController {
	
	private CatalogContainer model;
	private ListByYearView view;
	
	public ListByYearController(CatalogContainer model, ListByYearView view)
	{
		this.model = model;
		this.view = view;
	}

	public String getMediaItems() {
		return model.getFilms().toString() + model.getTvseries().toString();
	}
	
	public void updateView() {
		view.print(model.getFilms().toString() + model.getTvseries().toString());
	}
}
