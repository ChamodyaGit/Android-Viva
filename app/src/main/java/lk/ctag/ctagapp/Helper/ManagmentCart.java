package lk.ctag.ctagapp.Helper;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

import lk.ctag.ctagapp.Domain.PopularDomain;

public class ManagmentCart {
    private Context context;
    private TinyDB tinyDB;

    public ManagmentCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }


    public void insertFood(PopularDomain item){
        ArrayList<PopularDomain> listpop = getListCart();
        boolean existAlready = false;
        int n = 0;
        for (int i = 0; i < listpop.size(); i++){
            if (listpop.get(i).getTitle().equals(item.getTitle())){
                existAlready = true;
                n = i;
                break;
            }
        }
        if (existAlready){
            listpop.get(n).setNumberInCart(item.getNumberInCart());
        }else{
            listpop.add(item);
        }
        tinyDB.putListObject("CartList", listpop);
        Toast.makeText(context, "Added to Cart", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<PopularDomain>getListCart(){
        return tinyDB.getListObject("CartList");
    }
}
