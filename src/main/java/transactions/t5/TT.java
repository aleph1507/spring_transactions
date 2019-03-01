package transactions.t5;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tts")
public class TT {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date dateTime;
    private int tablePosId;
    private String tableName;
    private String employeeCode;
    private String employeeName;
    private int guestCount;
    private int customerPosId;
    private String customerName;
    private String posName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tt")
    //@OneToMany(mappedBy = "tt_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<TransactionLine> transactionLines = new HashSet<>();
    //List<TransactionLine> transactionLines;

//    private TransactionLine[] transactionLines;

   /* public TT() {}

    public TT(long id, Date dateTime, int tablePosId, String tableName, String employeeCode, String employeeName, int guestCount, int customerPosId, String customerName, String posName, List<TransactionLine> transactionLines) {
        this.id = id;
        this.dateTime = dateTime;
        this.tablePosId = tablePosId;
        this.tableName = tableName;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.guestCount = guestCount;
        this.customerPosId = customerPosId;
        this.customerName = customerName;
        this.posName = posName;
        this.transactionLines = transactionLines;
    }*/

    public long getID() {
        return id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getTablePosId() {
        return tablePosId;
    }

    public String getTableName() {
        return tableName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public int getCustomerPosId() {
        return customerPosId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPosName() {
        return posName;
    }

    public Set<TransactionLine> getTransactionLines() {
        return transactionLines;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setTablePosId(int tablePosId) {
        this.tablePosId = tablePosId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public void setCustomerPosId(int customerPosId) {
        this.customerPosId = customerPosId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public void setTransactionLines(Set<TransactionLine> transactionLines) {
        transactionLines.forEach(transactionLine -> transactionLine.setTt(this));
        this.transactionLines = transactionLines;
    }
}
