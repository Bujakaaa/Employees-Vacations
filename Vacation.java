package _11_Urlopy;

import java.time.LocalDate;

public class Vacation {

    private Employee employee;
    private LocalDate dateFrom;
    private LocalDate dateTo;


    public Vacation(Employee employee, LocalDate dateFrom, LocalDate dateTo) {
        this.employee = employee;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }
}
