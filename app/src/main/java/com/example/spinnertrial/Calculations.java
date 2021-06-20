import java.util.*;
import java.lang.*;

interface _inline_
{
    int calc(double x);
}

class Calculations {

    Dictionary function_values = new Hashtable();


    public Calculations()
    {

        _inline_ b8k=(x)->(int)Math.ceil(x*47);
        _inline_ b8r=(x)->(int)Math.ceil(x*10);
        function_values.put("b8",new _inline_[]{b8k,b8r});


        _inline_ b10k=(x)->(int)Math.ceil(x*53);
        _inline_ b10r=(x)->(int)Math.ceil(x*7);
        function_values.put("b10",new _inline_[]{b10k,b10r});

        _inline_ b12k=(x)->(int)Math.ceil(x*53);
        _inline_ b12r=(x)->(int)Math.ceil(x*5);
        function_values.put("b12",new _inline_[]{b12k,b12r});

        _inline_ b16k=(x)->(int)Math.ceil(x*56);
        _inline_ b16r=(x)->(int)Math.ceil(x*3);
        function_values.put("b16",new _inline_[]{b16k,b16r});

        _inline_ b20k=(x)->(int)Math.ceil(x*59);
        _inline_ b20r=(x)->(int)Math.ceil(x*2);
        function_values.put("b20",new _inline_[]{b20k,b20r});



        
        _inline_ k8b=(x)->(int)Math.ceil(x/47);
        _inline_ k8r=(x)->(int)Math.ceil(x/4.7);
        function_values.put("k8",new _inline_[]{k8b,k8r});


        _inline_ k10b=(x)->(int)Math.ceil(x/53);
        _inline_ k10r=(x)->(int)Math.ceil((x*7)/53);
        function_values.put("k10",new _inline_[]{k10b,k10r});

        _inline_ k12b=(x)->(int)Math.ceil(x/53);
        _inline_ k12r=(x)->(int)Math.ceil((x*5)/53);
        function_values.put("k12",new _inline_[]{k12b,k12r});

        _inline_ k16b=(x)->(int)Math.ceil(x/56);
        _inline_ k16r=(x)->(int)Math.ceil((x*3)/56);
        function_values.put("k16",new _inline_[]{k16b,k16r});

        _inline_ k20b=(x)->(int)Math.ceil(x/59);
        _inline_ k20r=(x)->(int)Math.ceil((x*2)/59);
        function_values.put("k20",new _inline_[]{k20b,k20r});



          
        _inline_ r8b=(x)->(int)Math.ceil(x/10);
        _inline_ r8k=(x)->(int)Math.ceil(x*4.7);
        function_values.put("r8",new _inline_[]{r8b,r8k});

        _inline_ r10b=(x)->(int)Math.ceil(x/7);
        _inline_ r10k=(x)->(int)Math.ceil((x*53)/7);
        function_values.put("r10",new _inline_[]{r10b,r10k});

        _inline_ r12b=(x)->(int)Math.ceil(x/5);
        _inline_ r12k=(x)->(int)Math.ceil((x*53)/5);;
        function_values.put("r12",new _inline_[]{r12b,r12k});

        _inline_ r16b=(x)->(int)Math.ceil(x/3);
        _inline_ r16k=(x)->(int)Math.ceil((x*56)/3);;
        function_values.put("r16",new _inline_[]{r16b,r16k});

        _inline_ r20b=(x)->(int)Math.ceil(x/2);
        _inline_ r20k=(x)->(int)Math.ceil((x*59)/2);;
        function_values.put("r20",new _inline_[]{r20b,r20k});




    }


    public _inline_[] assigner(String modifier)
    {
        _inline_[] dic =(_inline_[]) function_values.get(modifier);
        return dic;

    }
    /*class abc {

       public static void main(String args[])
        {
            
            Calculations obj = new Calculations();
            _inline_[] a = (_inline_[]) obj.function_values.get("k8");
            
            //_inline_[] a = (_inline_[]) super.function_values.get("b8");
            System.out.println(a[0].calc(10));
            System.out.println(a[1].calc(10));
        }
    
    }*/


}