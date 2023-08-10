package de.telran.practice.lesson28_08082023;

public class Transaction {
    public enum TransactionStatus {
        PENDING, COMPLETED, FAILED
    }

    private long id;
    private TransactionStatus status;

    public Transaction(long id, TransactionStatus status) {
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
