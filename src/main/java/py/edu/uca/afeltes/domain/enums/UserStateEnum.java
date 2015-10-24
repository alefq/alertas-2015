package py.edu.uca.afeltes.domain.enums;

public enum UserStateEnum {
    ACTIVE, SUSPENDED_BY_ADMIN, WAITING_FOR_APPROVAL;

    @Override
    public String toString() {
        return this.name();
    }
}
