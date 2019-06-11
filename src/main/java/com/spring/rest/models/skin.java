package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.lang.String;

import javax.persistence.Column;
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
	@JsonProperty("id")
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
	@Embedded
	private Buttons buttons;
	
	Skin(){}
	
	Skin(String lastUpdated, String name, String description, Images images, Colors colors, Fonts fonts, Buttons buttons){
		this.lastUpdated = lastUpdated;
		this.name = name;
		this.description = description;
		this.images = images;
		this.colors = colors;
		this.fonts = fonts;
		this.buttons = buttons;
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
	@JsonProperty("buttonSelected")
	private List<String> colorButtonSelected;
	@ElementCollection(targetClass=String.class)
	@JsonProperty("buttonEnabled")
	private List<String> colorButtonEnabled;
	@ElementCollection(targetClass=String.class)
	@JsonProperty("buttonDisabled")
	private List<String> colorButtonDisabled;
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
		this.colorButtonSelected = buttonSelected;
		this.colorButtonEnabled = buttonEnabled;
		this.colorButtonDisabled = buttonDisabled;
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


@Data
class Buttons{
	@Embedded
	private btnPrimary btn_primary;
	@Embedded
	private btnSecondary btn_secondary;
	@Embedded
	private btnSuccess btn_success;
	@Embedded
	private btnDanger btn_danger;
	@Embedded
	private btnWarning btn_warning;
	@Embedded
	private btnInfo btn_info;
	@Embedded
	private btnTertiary btn_tertiary;
	
	Buttons(){}
	
	Buttons(btnPrimary btn_primary, btnSecondary btn_secondary, btnSuccess btn_success, btnDanger btn_danger, btnWarning btn_warning, btnInfo btn_info, btnTertiary btn_tertiary){
		this.btn_danger = btn_danger;
		this.btn_info = btn_info;
		this.btn_primary = btn_primary;
		this.btn_secondary = btn_secondary;
		this.btn_success = btn_success;
		this.btn_tertiary = btn_tertiary;
		this.btn_warning = btn_warning;
	}
}

@Data
class btnPrimary{
	@JsonProperty("text")
	@Embedded
	private Text textPri;
	@JsonProperty("border")
	@Embedded
	private Border borderPri;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorPri;
	@JsonProperty("gradient")
	private String gradientPri;
	
	btnPrimary(){}
	
	btnPrimary(Text text, Border border, List<String> color, String gradient){
		this.borderPri = border;
		this.colorPri = color;
		this.gradientPri = gradient;
		this.textPri = text;
	}
	
}

@Data
class btnSecondary{
	@JsonProperty("text")
	@Embedded
	private Text textSec;
	@JsonProperty("border")
	@Embedded
	private Border borderSec;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorSec;
	@JsonProperty("gradient")
	private String gradientSec;
	
	btnSecondary(){}
	
	btnSecondary(Text text, Border border, List<String> color, String gradient){
		this.borderSec = border;
		this.colorSec = color;
		this.gradientSec = gradient;
		this.textSec = text;
	}
	
	
}

@Data
class btnSuccess{
	@JsonProperty("text")
	@Embedded
	private Text textSuc;
	@JsonProperty("border")
	@Embedded
	private Border borderSuc;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorSuc;
	@JsonProperty("gradient")
	private String gradientSuc;
	
	btnSuccess(){}
	
	btnSuccess(Text text, Border border, List<String> color, String gradient){
		this.borderSuc = border;
		this.colorSuc = color;
		this.gradientSuc = gradient;
		this.textSuc = text;
	}
	
	
}

@Data
class btnDanger{
	@JsonProperty("text")
	@Embedded
	private Text textDan;
	@JsonProperty("border")
	@Embedded
	private Border borderDan;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorDan;
	@JsonProperty("gradient")
	private String gradientDan;
	
	btnDanger(){}
	
	btnDanger(Text text, Border border, List<String> color, String gradient){
		this.borderDan = border;
		this.colorDan = color;
		this.gradientDan = gradient;
		this.textDan = text;
	}
	
	
}

@Data
class btnWarning{
	@JsonProperty("text")
	@Embedded
	private Text textWar;
	@JsonProperty("border")
	@Embedded
	private Border borderWar;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorWar;
	@JsonProperty("gradient")
	private String gradientWar;
	
	btnWarning(){}
	
	btnWarning(Text text, Border border, List<String> color, String gradient){
		this.borderWar = border;
		this.colorWar = color;
		this.gradientWar = gradient;
		this.textWar = text;
	}
	
	
}

@Data
class btnInfo{
	@JsonProperty("text")
	@Embedded
	private Text textInf;
	@JsonProperty("border")
	@Embedded
	private Border borderInf;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorInf;
	@JsonProperty("gradient")
	private String gradientInf;
	
	btnInfo(){}
	
	btnInfo(Text text, Border border, List<String> color, String gradient){
		this.borderInf = border;
		this.colorInf = color;
		this.gradientInf = gradient;
		this.textInf = text;
	}
	
	
}

@Data
class btnTertiary{
	@JsonProperty("text")
	@Embedded
	private Text textTer;
	@JsonProperty("border")
	@Embedded
	private Border borderTer;
	@JsonProperty("color")
	@ElementCollection(targetClass=String.class)
	private List<String> colorTer;
	@JsonProperty("gradient")
	private String gradientTer;
	
	btnTertiary(){}
	
	btnTertiary(Text text, Border border, List<String> color, String gradient){
		this.borderTer = border;
		this.colorTer = color;
		this.gradientTer = gradient;
		this.textTer = text;
	}
	
	
}

@Data
class Text{
	@Column(name = "font", insertable = false, updatable = false)
	private String font;
	@Column(name = "size", insertable = false, updatable = false)
	private String size;
	@Column(name = "style", insertable = false, updatable = false)
	private String style;
	@Column(name = "color", insertable = false, updatable = false)
	@JsonProperty("color")
	private String colorPicker;
	@JsonProperty("align")
	@Column(name = "align", insertable = false, updatable = false)
	private String alignText;
	
	Text(){}
	
	Text(String font, String size, String style, String color, String align){
		this.alignText = align;
		this.colorPicker = color;
		this.font = font;
		this.size = size;
		this.style = style;
	}
}

@Data
class Border{
	@Column(name = "radius", insertable = false, updatable = false)
	private String radius;
	@Column(name = "line", insertable = false, updatable = false)
	private String line;
	@Column(name = "colorOnTop", insertable = false, updatable = false)
	@JsonProperty("color")
	private String colorOnTop;
	
	Border(){}
	
	Border(String radius, String line, String color){
		this.colorOnTop = color;
		this.line = line;
		this.radius = radius;
	}
}

