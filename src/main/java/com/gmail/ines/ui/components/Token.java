package com.gmail.ines.ui.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.gmail.ines.ui.layout.size.Left;
import com.gmail.ines.ui.layout.size.Right;
import com.gmail.ines.ui.util.FontSize;
import com.gmail.ines.ui.util.LumoStyles;
import com.gmail.ines.ui.util.TextColor;
import com.gmail.ines.ui.util.UIUtils;
import com.gmail.ines.ui.util.css.BorderRadius;
import com.gmail.ines.ui.util.css.Display;

public class Token extends FlexBoxLayout {

	private final String CLASS_NAME = "token";

	public Token(String text) {
		setAlignItems(FlexComponent.Alignment.CENTER);
		setBackgroundColor(LumoStyles.Color.Primary._10);
		setBorderRadius(BorderRadius.M);
		setClassName(CLASS_NAME);
		setDisplay(Display.INLINE_FLEX);
		setPadding(Left.S, Right.XS);
		setSpacing(Right.XS);

		Label label = UIUtils.createLabel(FontSize.S, TextColor.BODY, text);
		Button button = UIUtils.createButton(VaadinIcon.CLOSE_SMALL, ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_TERTIARY_INLINE);
		add(label, button);
	}

}
