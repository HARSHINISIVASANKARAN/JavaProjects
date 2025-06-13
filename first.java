package project1_3;
import java.util.*;
public class first {

			node head;
			class node
			{
				int data;
				node next;
				node(int num)
				{
					data=num;
					next=null;
				}
			}
			public void insert(int num)
			{
				node newnode =new node(num);
				if (head==null)
						{
				head=newnode;
				newnode.next=null;
						}
				else
				{
					newnode.next=head;
					head=newnode;
				}
			}
			public void display()
			{
				node current =head;
				while(current!=null)
				{
					System.out.print(current.data+" ");
					current=current.next;
					
				}
				System.out.println("value inserted:");
			}
			public static void main(String []args)
			{
				first d=new first();
				Scanner sd= new Scanner(System.in);
				System.out.println("enter the size:");
				int size=sd.nextInt();
                for(int i =0;i<size;i++)
                {
				System.out.println("enter the elements to insert:");
				int insertion=sd.nextInt();
;				d.insert(insertion);
 }			
                d.display();
	}
}
