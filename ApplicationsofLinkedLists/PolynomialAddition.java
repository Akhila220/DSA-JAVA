class PolynomialNode{
    int power;
    int coefficent;
    PolynomialNode next;
        PolynomialNode(int power,int coefficent){
            this.power=power;
            this.coefficent=coefficent;
            this.next=null;
        }
}
class PolynomialAddition {
    public static PolynomialNode insert(int power,int coefficent,PolynomialNode head){
        PolynomialNode temp=head;
        PolynomialNode newNode =new PolynomialNode(power,coefficent);
        if(head==null){
            head=newNode;
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public static PolynomialNode addition(PolynomialNode p,PolynomialNode q){
        PolynomialNode result=null;
        int c=0;
        while(p!=null&&q!=null){
            if(p.power==q.power){
                c=p.coefficent+q.coefficent;
                result=insert(p.power,c,result);
                p=p.next;
                q=q.next;
            }
            else if(p.power>q.power){
                result=insert(p.power,p.coefficent,result);
                p=p.next;
            }
            else{
                result=insert(q.power,q.coefficent,result);
                q=q.next;
            }

        }
        while(p!=null){
             result=insert(p.power,p.coefficent,result);
                p=p.next;
        }
        while(q!=null){
            result=insert(q.power,q.coefficent,result);
                q=q.next;
        }
        return result;
    }
    public static void  display(PolynomialNode node){
       PolynomialNode temp=node;
        while(temp!=null){
            System.out.print(temp.coefficent+"x^"+temp.power);
            if(temp.next!=null){
                System.out.print("+");
            }
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        PolynomialNode p=null;
        PolynomialNode q=null;
        p=insert(4,2,p);
        p=insert(3,5,p);
        p=insert(1,5,p);
        q=insert(5,3,q);
        q=insert(3,2,q);
        q=insert(2,5,q);
        q=insert(1,6,q);
        display(p);
        System.out.println();
        display(q);
        System.out.println();
        PolynomialNode result=addition(p, q);
        display(result);
    }
}