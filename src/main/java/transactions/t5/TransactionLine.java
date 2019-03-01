package transactions.t5;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
@Entity
@Table(name = "transactionLines")
public class TransactionLine {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private int lineType;
    private String itemName;
    private String itemCode;
    private int amount;
    private double priceEach;
    private double vatPercentage;
    private String menuName;
    private String groupName;
    private String field1;
    private String field2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tt_id", nullable = false)
    @JsonIgnore
    private TT tt;

//    private long transaction_ID;

    /*public TransactionLine() {}

    public TransactionLine(long id*//*, long transaction_ID*//*, String description, int lineType, String itemName, String itemCode, int amount, double priceEach, double vatPercentage, String menuName, String groupName, String field1, String field2) {
        this.id = id;
        //this.tt_id = ;
        this.description = description;
        this.lineType = lineType;
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.amount = amount;
        this.priceEach = priceEach;
        this.vatPercentage = vatPercentage;
        this.menuName = menuName;
        this.groupName = groupName;
        this.field1 = field1;
        this.field2 = field2;
    }*/

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getLineType() {
        return lineType;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getAmount() {
        return amount;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public double getVatPercentage() {
        return vatPercentage;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    /*public TT getTransaction() {
        return tt;
    }*/

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLineType(int lineType) {
        this.lineType = lineType;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public void setVatPercentage(double vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setTt(TT tt) {
        this.tt = tt;
    }
}
