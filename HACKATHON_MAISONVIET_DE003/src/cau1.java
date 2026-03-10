public class cau1 {
    String text;
    public cau1(String text) {
        this.text = text;
    }
    int countMax(){
        int countText=0;
        int countNum =0;
        int countKitu=0;
        String []textSplit = text.split("");
        int result=0;
        for (int i=0;i<textSplit.length;i++){
            if (textSplit[i] != null) {
                if (textSplit[i].matches("[A-z]")) {
                    countText++;
                }
            }
        }
        for (int i=0;i<textSplit.length;i++){
            if(textSplit[i]!=null) {
                if (textSplit[i].matches("[0-9]")) {
                    countNum++;
                }
            }
        }
        for (int i=0;i<textSplit.length;i++){
            if (textSplit[i]!=null) {
                if (textSplit[i].matches("[^\\w]")) {
                    countKitu++;
                }
            }
        }

        System.out.println("Đây là số lượng kí tự đăc biet "+countKitu);
        System.out.println("Đây là số lương chữ "+countText);
        System.out.println("Đây là số lượng số"+countNum);
        if(countKitu>countNum&&countKitu>countText){
            result=countKitu;
        }
        if(countText>countKitu&&countText>countNum){
            result=countText;
        }
        if (countNum>countText&&countNum>countKitu){
            result=countNum;
        }
        return result;
    }
}
