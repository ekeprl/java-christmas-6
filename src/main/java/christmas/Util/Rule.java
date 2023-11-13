package christmas.Util;

import java.util.regex.Pattern;

public class Rule {
    public static final int DATEZERO = 0;
    public static final int MIN_DATE = 1;
    public static final int MAX_DATE = 31;
    public static final int NORMAL_SALE = 2023;
    public static final int WEEKEND_SALE = 2023;
    public static final int DAY_INCREASEMONEY = 100;
    public static final int BASIC_SALEMONEY = 1000;
    public static final int BADGE_MIN = 5000;
    public static final int BADGE_MID = 10000;
    public static final int BADGE_MAX = 20000;


    //패턴
    public static final Pattern DATENumberPattern = Pattern.compile("^[1-9][0-9]*$");
    public static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    public static final Pattern MENU_PATTERN = Pattern.compile("([\\w\\s]+)-(\\d+)(?:,\\s*)?");
    public static final String BADGE_MIN_MESSAGE = "별";
    public static final String BADGE_MID_MESSAGE = "트리";
    public static final String BADGE_MAX_MESSAGE = "산타";
    public static final String WEEKDAYS_MESSAGE = "평일";
    public static final String WEEKEND_MESSAGE = "주말";


    //메시지(INPUT)
    public static final String FIRSTINPUT_MESSAGE = "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)";
    public static final String SECONDINPUT_MESSAGE = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)";


    //메시지(OUTPUT)
    public static final String BASIC_MESSAGE = " 안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.";
    public static final String DATE_MESSAGE = "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!";
    public static final String ORDER_MESSAGE = "<주문 메뉴>";
    public static final String ORIGINALPRICE_MESSAGE = "<주문 메뉴>";
    public static final String SERVICE_MESSAGE = "<할인 전 총주문 금액>";
    public static final String ALLSALE_MESSAGE = "<증정 메뉴>";
    public static final String AFTERSALE_MESSAGE = "<혜택 내역>";
    public static final String WILLPAY_MESSAGE = "<할인 후 예상 결제 금액>";
    public static final String BADGE_MESSAGE = "<12월 이벤트 배지>";





    //에러
    public static final String ERROR ="[ERROR]";
    public static final String LOTTO_NUM_DUPLICATE_ERROR = ERROR + "중복된 숫자가 포함되어있습니다";
    public static final String LOTTO_NUM_RANGE = ERROR + MIN_DATE + "부터" + MAX_DATE + "까지의 숫자만 입력가능합니다.";
    public static final String WRONGNUM_ERROR = ERROR + "숫자만 입력해주세요";
    public static final String DATEZERO_PATTERN = ERROR + "0은 입력할 수 없습니다.";
    public static final String MENUINPUT_ERROR = ERROR + "메뉴 입력 방식이 잘못되었습니다.";
    public static final String DATERANGE_ERROR = ERROR + "31일 이상은 입력할 수 없습니다.";

}
