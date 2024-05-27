@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long accountId;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private Double amount;

    private LocalDateTime timestamp;

    // Getters and setters
}

public enum TransactionType {
    DEPOSIT, WITHDRAWAL
}
