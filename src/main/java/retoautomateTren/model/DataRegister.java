package retoautomateTren.model;

public class DataRegister {

    public String tipeTravel;
    public String destination;
    public String route;
    //fecha de partida
    public String dataToSetIni;
    public String yearIni;
    public String monthIni;
    public String dayIni;
    //fecha de llegada
    public String dataToSetEnd;
    public String yearEnd;
    public String monthEnd;
    public String dayEnd;
    public String adults ;
    public String children ;


    public String getYearIni() {
        return yearIni;
    }

    public String getMonthIni() {
        return monthIni;
    }

    public String getDayIni() {
        return dayIni;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public String getTipeTravel() {
        return tipeTravel;
    }

    public String getDestination() {
        return destination;
    }

    public String getRoute() {
        return route;
    }

    public String getDataToSetIni() {
        return dataToSetIni;
    }

    public String getDataToSetEnd() {
        return dataToSetEnd;
    }

    public String getAdults() {
        return adults;
    }

    public String getChildren() {
        return children;
    }

}

