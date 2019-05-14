package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Id;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;


@Data
@Entity
public class skin {
	
	@Id @GeneratedValue
	private Long id;
	@Embedded
	private Partner partner;
	@Embedded
	private Skin skin;
	
}

class Partner{
	private String id;
	private String lang;
	
	Partner(){}
	
	Partner(String id, String lang){
		this.id = id;
		this.lang = lang;
	}
}

class Skin{
	private String lastUpdated;
	private String name;
	private String description;
	@Embedded
	private Images images;
	@Embedded
	private Colors colors;
	@Embedded
	private Fonts fonts;
	
	Skin(){}
	
	Skin(String lastUpdated, String name, String description, Images images, Colors colors, Fonts fonts){
		this.lastUpdated = lastUpdated;
		this.name = name;
		this.description = description;
		this.images = images;
		this.colors = colors;
		this.fonts = fonts;
	}
}

class Images{
	private String splash;
	private String bgMain;
	private String bgAccess;
	
	Images(){}
	
	Images(String splash, String bgMain, String bgAccess){
		this.splash = splash;
		this.bgMain = bgMain;
		this.bgAccess = bgAccess;
	}
}

class Colors{
	private List<String> bgMain;
	private List<String> bgChat;
	private List<String> bgLogin;
	private List<String> bgWall;
	private List<String> bgPeople;
	private List<String> bgDashboard;
	private List<String> bgVoucher;
	private List<String> bgPermission;
	private List<String> bgRegister;
	private List<String> buttonFb;
	private List<String> buttonGoogle;
	private List<String> buttonTwitter;
	private List<String> buttonInstagram;
	private List<String> buttonLinkedin;
	private List<String> buttonSelected;
	private List<String> buttonEnabled;
	private List<String> buttonDisabled;
	
	Colors(){}
	
	Colors(List<String> bgMain, 
			List<String> bgChat,
			List<String> bgLogin,
			List<String> bgWall,
			List<String> bgPeople,
			List<String> bgDashboard,
			List<String> bgVoucher,
			List<String> bgPermission,
			List<String> bgRegister,
			List<String> buttonFb,
			List<String> buttonGoogle,
			List<String> buttonTwitter,
			List<String> buttonInstagram,
			List<String> buttonLinkedin,
			List<String> buttonSelected,
			List<String> buttonEnabled,
			List<String> buttonDisabled){
		this.bgMain = bgMain;
		this.bgChat = bgChat;
		this.bgLogin = bgLogin;
		this.bgWall = bgWall;
		this.bgPeople = bgPeople;
		this.bgDashboard = bgDashboard;
		this.bgVoucher = bgVoucher;
		this.bgPermission = bgPermission;
		this.bgRegister = bgRegister;
		this.buttonFb = buttonFb;
		this.buttonGoogle = buttonGoogle;
		this.buttonTwitter = buttonTwitter;
		this.buttonInstagram = buttonInstagram;
		this.buttonLinkedin = buttonLinkedin;
		this.buttonSelected = buttonSelected;
		this.buttonEnabled = buttonEnabled;
		this.buttonDisabled = buttonDisabled;
	}
	
}

class Fonts{
	private List<String> buttonSelected;
	private List<String> buttonEnabled;
	private List<String> buttonDisabled;
	private List<String> textFriends;
	private List<String> textHighlight;
	private List<String> textTitle;
	private List<String> textSubtitle;
	private List<String> textNormal;
	private List<String> textSmall;
	private List<String> textTiny;
	
	Fonts(){}
	
	Fonts(List<String> buttonSelected, 
		  List<String> buttonEnabled,
		  List<String> buttonDisabled,
		  List<String> textFriends,
		  List<String> textHighlight,
		  List<String> textTitle,
		  List<String> textSubtitle,
		  List<String> textNormal,
		  List<String> textSmall,
		  List<String> textTiny){
		this.buttonSelected = buttonSelected;
		this.buttonEnabled = buttonEnabled;
		this.buttonDisabled = buttonDisabled;
		this.textFriends = textFriends;
		this.textHighlight = textHighlight;
		this.textTitle = textTitle;
		this.textSubtitle = textSubtitle;
		this.textNormal = textNormal;
		this.textSmall = textSmall;
		this.textTiny = textTiny;
	}
	
}