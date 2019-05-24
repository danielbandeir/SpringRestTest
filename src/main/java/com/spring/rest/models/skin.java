package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Id;

import java.util.List;
import java.lang.String;

import javax.persistence.ElementCollection;
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

@Data
class Partner{
	private String partnerid;
	private String lang;
	
	Partner(){}
	
	Partner(String id, String lang){
		this.partnerid = id;
		this.lang = lang;
	}
}

@Data
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

@Data
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

@Data
class Colors{
	@ElementCollection(targetClass=String.class)
	private List<String> bgMain;
	@ElementCollection(targetClass=String.class)
	private List<String> bgChat;
	@ElementCollection(targetClass=String.class)
	private List<String> bgLogin;
	@ElementCollection(targetClass=String.class)
	private List<String> bgWall;
	@ElementCollection(targetClass=String.class)
	private List<String> bgPeople;
	@ElementCollection(targetClass=String.class)
	private List<String> bgDashboard;
	@ElementCollection(targetClass=String.class)
	private List<String> bgVoucher;
	@ElementCollection(targetClass=String.class)
	private List<String> bgPermission;
	@ElementCollection(targetClass=String.class)
	private List<String> bgRegister;
	@ElementCollection(targetClass=String.class)
	private List<String> bgError;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonFb;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonGoogle;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonTwitter;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonInstagram;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonLinkedin;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonSelected;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonEnabled;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonDisabled;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonError;
	
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
			List<String> bgError,
			List<String> buttonFb,
			List<String> buttonGoogle,
			List<String> buttonTwitter,
			List<String> buttonInstagram,
			List<String> buttonLinkedin,
			List<String> buttonSelected,
			List<String> buttonEnabled,
			List<String> buttonDisabled,
			List<String> buttonError){
		this.bgMain = bgMain;
		this.bgChat = bgChat;
		this.bgLogin = bgLogin;
		this.bgWall = bgWall;
		this.bgPeople = bgPeople;
		this.bgDashboard = bgDashboard;
		this.bgVoucher = bgVoucher;
		this.bgPermission = bgPermission;
		this.bgRegister = bgRegister;
		this.bgError = bgError;
		this.buttonFb = buttonFb;
		this.buttonGoogle = buttonGoogle;
		this.buttonTwitter = buttonTwitter;
		this.buttonInstagram = buttonInstagram;
		this.buttonLinkedin = buttonLinkedin;
		this.buttonSelected = buttonSelected;
		this.buttonEnabled = buttonEnabled;
		this.buttonDisabled = buttonDisabled;
		this.buttonError = buttonError;
	}
	
}

@Data
class Fonts{
	@ElementCollection(targetClass=String.class)
	private List<String> buttonSelected;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonEnabled;
	@ElementCollection(targetClass=String.class)
	private List<String> buttonDisabled;
	@ElementCollection(targetClass=String.class)
	private List<String> textError;
	@ElementCollection(targetClass=String.class)
	private List<String> textFriends;
	@ElementCollection(targetClass=String.class)
	private List<String> textHighlight;
	@ElementCollection(targetClass=String.class)
	private List<String> textTitle;
	@ElementCollection(targetClass=String.class)
	private List<String> textSubtitle;
	@ElementCollection(targetClass=String.class)
	private List<String> textNormal;
	@ElementCollection(targetClass=String.class)
	private List<String> textSmall;
	@ElementCollection(targetClass=String.class)
	private List<String> textTiny;
	
	Fonts(){}
	
	Fonts(List<String> buttonSelected, 
		  List<String> buttonEnabled,
		  List<String> buttonDisabled,
		  List<String> textError,
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
		this.textError = textError;
		this.textFriends = textFriends;
		this.textHighlight = textHighlight;
		this.textTitle = textTitle;
		this.textSubtitle = textSubtitle;
		this.textNormal = textNormal;
		this.textSmall = textSmall;
		this.textTiny = textTiny;
	}
	
}