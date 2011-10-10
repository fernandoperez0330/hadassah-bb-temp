package com.wiledsolutions.hadassah.views;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;

public class PanelControl extends MainScreen {

	/**
	 * 
	 */
	public PanelControl() {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		setTitle("Haddassah - Panel de control");
		add(new RichTextField("Mensajes",Field.NON_FOCUSABLE));
		add(new RichTextField("Horarios",Field.NON_FOCUSABLE));
		add(new RichTextField("Tareas",Field.NON_FOCUSABLE));
		add(new RichTextField("Documentos",Field.NON_FOCUSABLE));
		add(new RichTextField("Grupos",Field.NON_FOCUSABLE));
		add(new RichTextField("Perfil",Field.NON_FOCUSABLE));
	}
	
	public void close(){}
}
