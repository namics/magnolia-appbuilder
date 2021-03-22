package com.namics.oss.magnolia.appbuilder.action.edit;

import com.namics.oss.magnolia.appbuilder.MgnlIcon;
import com.namics.oss.magnolia.appbuilder.action.AppActionDefinition;
import com.namics.oss.magnolia.appbuilder.builder.generated.action.OpenMoveDialogActionBuilder;
import info.magnolia.ui.api.action.ConfiguredActionDefinition;

public class MoveAppActionDefinition implements AppActionDefinition {
	private final String icon;
	private final String label;

	public MoveAppActionDefinition() {
		this(MgnlIcon.MOVE, "actions.move");
	}

	public MoveAppActionDefinition(final String icon, final String label) {
		this.icon = icon;
		this.label = label;
	}

	@Override
	public ConfiguredActionDefinition action() {
		return new OpenMoveDialogActionBuilder()
				.name("move")
				.label(label)
				.icon(icon);
	}
}
