package com.smlnskgmail.jaman.hashcheckerlite.logic.hashcalculator.ui.lists.actions.ui;

import com.smlnskgmail.jaman.hashcheckerlite.logic.hashcalculator.ui.lists.actions.Action;

import java.util.Arrays;
import java.util.List;

public class ActionSelectActionsBottomSheet extends ActionsBottomSheet {

    @Override
    List<Action> getActions() {
        return Arrays.asList(
                Action.GENERATE,
                Action.COMPARE
        );
    }

}
