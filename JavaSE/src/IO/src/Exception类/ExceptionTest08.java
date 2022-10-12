package IO.src.Exception类;
//重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。

/*
* 总结异常的关键字
* try
* catch
* finally
*
* throw
* throws
*
* */
public class ExceptionTest08 {
    public void doSome(){

    }
    public void doOther() throws Exception{

    }
}

class Cat extends ExceptionTest08 {
    //编译报错
    /*public void doSome()throws Exception{

    }*/
    //编译正常
    //public void doOther() throws Exception{

    //}
    //编译正常
    public void doOther()throws NullPointerException{

    }
}
