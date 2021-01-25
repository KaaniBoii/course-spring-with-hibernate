package de.oette.course.C02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupComponent {

    @Autowired
    private PersistDemoComponent persistDemoComponent;

    @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {
        try {
            persistDemoComponent.persistEntity();
            persistDemoComponent.persistEntity();
            persistDemoComponent.persistEntity();
            persistDemoComponent.persistEntity();
        } catch (RuntimeException ex) {
            System.err.println(ex);
        }
    }
}
