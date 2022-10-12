package IO.src.练习程序;

import IO.src.Exception类.ExceptionTest06;

public class MyStack {
    private Object [] elements;
    private int index;//表示栈帧指向顶部元素。
    public MyStack(){
        this.elements=new Object[10];
        this.index=-1;
    }
    public void push(Object obj) throws ExceptionTest06 {
        if (index >= elements.length-1){
        throw new ExceptionTest06("压栈失败，栈已满");
        }
        index++;
        elements[index]=obj;
        System.out.println("压栈"+obj + "元素成功，栈帧指向" + index);
    }
    public void  pop()throws ExceptionTest06 {
        if (index<0){
            //System.out.println("弹栈是白，栈已空");
            //return;
            throw new ExceptionTest06("弹栈失败，栈以空");
        }
        System.out.println("弹栈"+ elements[index] + "元素成功");
        index--;
        System.out.println("栈帧指向" + index);
    }
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
