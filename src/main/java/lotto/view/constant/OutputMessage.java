package lotto.view.constant;

public enum OutputMessage {

    PURCHASED_COUNT("개를 구매했습니다."),
    NEWLINE("\n"),
    STATS_MESSAGE("\n당첨 통계\n---\n"),
    WINNING_STATS_FIVE_RANK("3개 일치 (5,000원) - %d개\n"),
    WINNING_STATS_FOUR_RANK("4개 일치 (50,000원) - %d개\n"),
    WINNING_STATS_THIRD_RANK("5개 일치 (1,500,000원) - %d개\n"),
    WINNING_STATS_SECOND_RANK("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n"),
    WINNING_STATS_FIRST_RANK("6개 일치 (2,000,000,000원) - %d개\n");

    private final String message;

    OutputMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
