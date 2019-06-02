package backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List <Things> things;
    private List <Things> listResult = null;
    private int maxWeigt;

    public Backpack(List <Things> things, int maxWeight) {
        this.things = things;
        this.maxWeigt = maxWeight;
    }

    public List <Things> getContentBackpack () {

        searchResult(things.size());
        return listResult;
    }

    private void searchResult(int length) {
        if (length == 1) {
            return;
        }

        for (int i = 0; i < length; i++) {
            getSumWeight();
            searchResult(length - 1);
            rotate(length);
        }
    }

    private void rotate(int length) {
        int pos = things.size() - length;
        Things temp = things.get(pos);

        for (int i = pos + 1; i < things.size(); i++) {
            things.set(i - 1, things.get(i));
        }
        things.set(things.size()-1, temp);
    }


    private int getSumPrice (List <Things> things) {
        int result = 0;
        for (Things th : things) {
            result = result + th.getPrice();
        }
        return result;
    }

    private void getSumWeight () {
        int result = 0;
        int price = 0 ;
        int count = 0;
        for (Things th : things) {
            if (result + th.getWeight()> maxWeigt ){
                break;
            }
            count++;
            result = result + th.getWeight();
            price = price + th.getPrice();
        }
        if (listResult == null) {
            for (int i=0; i< count; i++) {
                listResult =new ArrayList<>();
                listResult.add(things.get(i));
            }
        } else if (price > getSumPrice(listResult)) {
            listResult.clear();
            for (int i=0; i<count; i++) {
                listResult.add(things.get(i));
            }
        }
    }


}
