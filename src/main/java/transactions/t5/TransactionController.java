package transactions.t5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// spring.datasource.url=jdbc:hsqldb:file:./bookings.db

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {

    TransactionRepository _repository;
//    private List<TT> transactions;
//
//    private ArrayList<TransactionLine> tLine;

//    TransactionLine[] tLine = {
//            new TransactionLine(11,
//            1,
//            "description",
//            3,
//            "itemName",
//            "itemCode",
//            89,
//            12,
//            18,
//            "menu name",
//            "group name",
//            "",
//            ""
//            ),
//            new TransactionLine(11,
//                    1,
//                    "description",
//                    3,
//                    "itemName",
//                    "itemCode",
//                    89,
//                    12,
//                    18,
//                    "menu name",
//                    "group name",
//                    "",
//                    ""
//            ),
//    };

//    TT t = new TT(
//        1111,
//        new Date(),
//        123,
//        "tableName",
//        "empCode",
//        "empName",
//        22,
//        321,
//        "cus name",
//        "pos name",
//        tLine
//    );

    @Autowired
    public TransactionController(TransactionRepository tRepo) {
        this._repository = tRepo;
//        tLine  = new ArrayList<TransactionLine>( );
//
//        tLine.add(new TransactionLine(11,
////                1,
//                "description",
//                3,
//                "itemName",
//                "itemCode",
//                89,
//                12,
//                18,
//                "menu name",
//                "group name",
//                "",
//                ""
//        ));
//
//        TT t = new TT(
//                1111,
//                new Date(),
//                123,
//                "tableName",
//                "empCode",
//                "empName",
//                22,
//                321,
//                "cus name",
//                "pos name",
//                tLine
//        );
//
//        this.transactions = new ArrayList<>();
//
//        this.transactions.add(t);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<TT> getAll() {
        return _repository.findAll();
//        return transactions;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public TT create(@RequestBody TT transaction) {

//        Set<TransactionLine> transactionLines = transaction.getTransactionLines();
//
//        for(TransactionLine tl : transactionLines) {
//            transaction.getTransactionLines().add(tl);
//        }

        return _repository.save(transaction);
    }
}
