package link;

//链表优点：随即增删元素效率较高。（因为删除元素不涉及到大量元素位移）
//链表缺点：查询效率较低，每一次查找某个元素的时候就需要从头节点开始往下遍历。
public class Link {
    //头节点
    Node header;
    int size = 0;

    public int size() {
        return size;
    }

    //向链表中添加元素的方法（向末尾添加）
    public void add(Object data) {
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新节点对象。
        if (header == null) {
            //说明还没有节点
            //new一个新的节点对象，作为头节点对象。
            //这个时候的头节点既是一个头节点，又是一个末尾节点。
            header = new Node(data, null);
        } else {
            //说明头不是空
            //头节点已经存在
            //找出当前末尾节点，让末尾节点的next是新节点。
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }

    //专门查找末尾节点的方法
    private Node findLast(Node node) {
        if (node.next == null) {
            //如果一个节点的next是null
            //说明这个节点就是末尾节点。
            return node;
        }
        //程序能够到这里说明node不是末尾节点。
        return findLast(node.next);//递归算法
    }

    //删除链表中某个数据的方法
    public void remove(Object obj) {

    }

    //修改链表中某个数据的方法
    public void modify(Object obj) {

    }

    //查找链表中的某个元素的方法
    public int find(Object obj) {
        return 1;
    }
}
