package com.stw.kanban.client.widget.view;

import com.google.gwt.user.client.ui.Widget;
import com.stw.kanban.client.entities.Board;

public interface KanbanBoardView<T> {

	public interface Presenter<T> {
		void onLoadedBoard();
	}
	
	void setPresenter(Presenter<T> presenter);
	
	void setData(Board board);
	
	Widget asWidget();
	
}