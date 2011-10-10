package com.wiledsolutions.hadassah.views;

import net.rim.device.api.command.Command;
import net.rim.device.api.command.CommandHandler;
import net.rim.device.api.command.ReadOnlyCommandMetadata;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.XYEdges;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.decor.Border;
import net.rim.device.api.ui.decor.BorderFactory;

public class Login extends MainScreen {

	/**
	 * 
	 */
	Login screenLogin;
	
	public Login() {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		screenLogin = this;
		
		setTitle("Login - Hadassah");
		
		RichTextField textBrand = new RichTextField("Hadassah",RichTextField.FIELD_HCENTER);
		RichTextField textLogo = new RichTextField("LOGO",RichTextField.FIELD_HCENTER);
		
		RichTextField labelLogin = new RichTextField("Correo electronico",Field.NON_FOCUSABLE);
		RichTextField inputLogin = new RichTextField("",Field.FOCUSABLE);
		RichTextField spaceLogin = new RichTextField("",Field.NON_FOCUSABLE);
		RichTextField labelPassword = new RichTextField("Contraseña",Field.NON_FOCUSABLE);
		RichTextField inputPassword = new RichTextField("",Field.FOCUSABLE);
		ButtonField btnLogin = new ButtonField("Login",ButtonField.CONSUME_CLICK | Field.FIELD_RIGHT);
		ButtonField btnPasswordRetrieve = new ButtonField("Recuperar Clave",ButtonField.CONSUME_CLICK | Field.FIELD_RIGHT);
		ButtonField btnSupport = new ButtonField("Soporte",ButtonField.CONSUME_CLICK | Field.FIELD_RIGHT);
		
        // Set command to be invoked by the ButtonField
		btnLogin.setCommand(new Command(
				new CommandHandler() {
					public void execute(ReadOnlyCommandMetadata metadata, Object context) {
						UiApplication.getUiApplication().pushScreen(new PanelControl());
						screenLogin.close();
					}
				}
		));
		
        XYEdges thickPadding = new XYEdges(10, 10, 10, 10);
        Border roundedBorder = BorderFactory.createRoundedBorder(thickPadding, Border.STYLE_SOLID);
        
        inputLogin.setEditable(true);
        inputLogin.setBorder(roundedBorder);
        inputPassword.setBorder(roundedBorder);
        inputPassword.setEditable(true);
        spaceLogin.setPadding(10, 10, 10, 10);
        
        add(textBrand);
        add(textLogo);
        add(labelLogin);
        add(inputLogin);
        add(spaceLogin);
        add(labelPassword);
        add(inputPassword);
        add(btnLogin);
        add(btnPasswordRetrieve);
        add(btnSupport);
        
	}

}
