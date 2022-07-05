
public class BitCounting {
    public int converter(int number)
    {
        int[]listConvert = new int[number];
        int counter = 0;
        if(number > 0)
        {
            for(int x = 0; x < number; x++)
            {
                listConvert[x] += (int)Math.pow(2,x);
            }
            for(int i = listConvert.length - 1; i >= 0;i--)
            {
                if(number >= listConvert[i])
                {
                    number = (number-listConvert[i]);
                    counter++;
                }
            }
        }
        return counter;
    }


}
