
package com.rapidclipse.demo.globalactions.ui.actions;

import com.flowingcode.vaadin.addons.ironicons.IronIcons;
import com.rapidclipse.framework.server.ui.action.Action;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;


public class SaveAction extends Action.Abstract implements Action.ContextSensitive<Saveable>
{
	public SaveAction()
	{
		super();

		this.setIcon(IronIcons.SAVE);
		this.setText("Save");
		this.setShortcut(Key.KEY_S, KeyModifier.CONTROL);
	}
	
	@Override
	public void execute(final ComponentEvent<?> event)
	{
		this.getContext().save();
	}
}
