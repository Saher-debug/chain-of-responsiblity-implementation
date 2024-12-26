public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}

class dollar50Dispensor implements DispenseChain
{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain)
    {
     chain = nextChain;
    }
    @Override
    public void dispense(Currency cur)
    {
      if (cur.getAmount() >= 50){
          int num = cur.getAmount() / 50;
          int remainder = cur.getAmount() % 50;
          System.out.println("Dispensing " + num + " $50 note");
          if(remainder != 0)
          {
            this.chain.dispense(new Currency(remainder));
          }
          else
          {
              this.chain.dispense(cur);
          }
      }

    }
}
class dollar20Dispensor implements DispenseChain
{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        chain = nextChain;
    }
    @Override
    public void dispense(Currency cur)
    {
        if (cur.getAmount() >= 20){
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " $20 note");
            if(remainder != 0)
            {
                this.chain.dispense(new Currency(remainder));
            }
            else
            {
                this.chain.dispense(cur);
            }
        }

    }
}

class dollar10Dispensor implements DispenseChain
{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        chain = nextChain;
    }
    @Override
    public void dispense(Currency cur)
    {
        if (cur.getAmount() >= 10){
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " $10 note");
            if(remainder != 0)
            {
                this.chain.dispense(new Currency(remainder));
            }
            else
            {
                this.chain.dispense(cur);
            }
        }

    }
}