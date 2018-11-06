package enums;

public enum GroupMeEnum implements EnumInterface {
    // Authentication
    BOT_ID(System.getenv("GROUP_ME_BOT_ID")), // TODO: DO NOT COMMIT
    GROUP_ID(System.getenv("GROUP_ME_GROUP_ID")),
    ACCESS_TOKEN(System.getenv("GROUP_ME_ACCESS_TOKEN"));

    private final String value;

    GroupMeEnum(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
