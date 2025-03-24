package Test1;

import java.util.Date;
import java.util.UUID;

class AlertService {

    private Test1.AlertDAO storage = new MapAlertDAO();

    public AlertService (Test1.AlertDAO alertDAO) {
        this.storage = alertDAO;
    }

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}
