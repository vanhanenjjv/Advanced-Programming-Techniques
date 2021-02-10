package part_02.Infrastructure.Events;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// Source: https://stackoverflow.com/questions/3953208/value-change-listener-to-jtextfield
@FunctionalInterface
public interface SimpleDocumentListener extends DocumentListener {
    void updated(DocumentEvent event);

    @Override
    default void insertUpdate(DocumentEvent event) {
        updated(event);
    }
    @Override
    default void removeUpdate(DocumentEvent event) {
        updated(event);
    }
    @Override
    default void changedUpdate(DocumentEvent event) {
        updated(event);
    }
}