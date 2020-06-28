package homework;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class GUI{

	JFrame j1=new JFrame();
    JButton button1 = new JButton("新建");
    JButton button2 = new JButton("排序(名称)");
    JButton button3 = new JButton("排序(类型)");
    JButton button4 = new JButton("删除");
    JButton button5 = new JButton("修改");
    String[] str = {"","",""};
    DefaultListModel<String> listmodel = new DefaultListModel<String>();
	ArrayList<TASKLIST> listall = new ArrayList<TASKLIST>();
    JList<String> list = new JList<String>(listmodel);
	int i = 0;
    int count = 0;
    boolean flag = false;
	public GUI()
	{
		j1.setTitle("个人助理");
		j1.setBounds(200,200,500,500);
		j1.setVisible(true);
		j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container c = j1.getContentPane();
		c.setLayout(null);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(count<str.length)
				{
					JFrame j2 = new JFrame();
					Container c1 = j2.getContentPane();
					c1.setLayout(null);
					j2.setTitle("新建任务列表");
					j2.setSize(500,450);
					j2.setVisible(true);
					j2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					JLabel name = new JLabel();
			        name.setText("名称：");
			        name.setSize(60, 50);
			        name.setLocation(100, 80);
			        JLabel kind = new JLabel();
			        kind.setText("类型：");
			        kind.setSize(50, 50);
			        kind.setLocation(100, 120);
			        JTextField nameField = new JTextField();
			        nameField.setSize(100, 20);
			        nameField.setLocation(170, 95);
			        JTextField kindField = new JTextField();
			        kindField.setSize(100, 20);
			        kindField.setLocation(170, 135);
			        JButton ok = new JButton("OK");
			        ok.setSize(60,25);
			        ok.setLocation(135,260);
					c1.add(name);
					c1.add(kind);
					c1.add(nameField);
					c1.add(kindField);
					c1.add(ok);
					ok.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							j2.dispose();
							listmodel.addElement("第"+(i+1)+"个:"+nameField.getText()+"("+kindField.getText()+")");
							ArrayList<TASK> list1 = new ArrayList<TASK>();
							TASKLIST listone = new TASKLIST(nameField.getText(),kindField.getText(),i++,list1);
							listall.add(listone);
							list.setBounds(0,50,500,450);
							c.add(list);
						}
					});
				}
				else
				{
					button1.setEnabled(flag);//关闭按钮
					flag = true;				
				}
			}
		});
		list.setBounds(0,50,500,450);
		c.add(list);
		button1.setBounds(0,0,100,50);
	    c.add(button1);
	    
	    button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String[] l = new String[5];
				int[] h = new int[5];
				int k = 0,c = 0,d = 0;
				String t;
				int t1;
				for(c = 0;c < listall.size();c++,k++)
				{
					l[k] = listall.get(c).GetName();
					h[k] = c;
				}
				k = 0;
				for(c = 0;c < listall.size() - 1;c++)
				{
					String min = l[c];
					for(d = c + 1;d < listall.size();d++,k++) {
						if(l[d].compareTo(min) < 0)
						{
							t = l[d];
							l[d] = l[c];
							l[c] = t;
							min = t;
							t1 = h[d];
							h[d] = h[c];
							h[c] = t1;
						}
					}
				}
				k = 0;
				((DefaultListModel<String>) list.getModel()).removeAllElements();				
				for(d = 0;d < listall.size();d++,k++)
					listmodel.addElement("第"+(d+1)+"个:"+listall.get(h[k]).GetName()+"("+listall.get(h[k]).GetKind()+")");
			}
		});
	    button2.setBounds(100,0,100,50);
	    c.add(button2);
	    
	    button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String[] l=new String[5];
				int[] h=new int[5];
				int k=0,c=0,d=0;
				String t;
				int t1;
				for(c=0;c<listall.size();c++,k++)
				{
					l[k]=listall.get(c).GetKind();
					h[k]=c;
				}
				k=0;
				for(c=0;c<listall.size()-1;c++)
				{
					String min=l[c];
					for(d=c+1;d<listall.size();d++,k++) {
						if(l[d].compareTo(min)<0)
						{
							t=l[d];
							l[d]=l[c];
							l[c]=t;
							min=t;
							t1=h[d];
							h[d]=h[c];
							h[c]=t1;
						}
					}
				}
				k=0;
				((DefaultListModel<String>) list.getModel()).removeAllElements();				
				for(d=0;d<listall.size();d++,k++)
				{
					listmodel.addElement("第"+(d+1)+"个:"+listall.get(h[k]).GetName()+"("+listall.get(h[k]).GetKind()+")");
					listall.get(h[k]).SetI(d);
				}
			}
		});
	    button3.setBounds(200,0,100,50);
	    c.add(button3);
	    
	    button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame j3 = new JFrame();
				Container c2 = j3.getContentPane();
				c2.setLayout(null);
				j3.setTitle("删除任务列表");
				j3.setSize(500,400);
				j3.setVisible(true);
				j3.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				JLabel num = new JLabel();
		        num.setText("第几个：");
		        num.setSize(60, 50);
		        num.setLocation(100, 80);
		        JTextField numField = new JTextField();
		        numField.setSize(100, 20);
		        numField.setLocation(170, 95);
		        JButton ok=new JButton("OK");
		        ok.setSize(60,25);
		        ok.setLocation(135,260);
				c2.add(num);
				c2.add(numField);
				c2.add(ok);
				ok.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						j3.dispose();
						int c = Integer.parseInt(numField.getText().trim());
						listall.remove(c - 1);
						listmodel.removeAllElements();
						i--;
						for(int d=0;d<listall.size();d++)
							listmodel.addElement("第"+(d+1)+"个:"+listall.get(d).GetName()+"("+listall.get(d).GetKind()+")");
					}
				});
			}
		});
	    button4.setBounds(300,0,100,50);
	    c.add(button4);
	    
	    button5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame j4 = new JFrame();
				Container c3 = j4.getContentPane();
				c3.setLayout(null);
				j4.setTitle("修改任务列表");
				j4.setSize(500,400);
				j4.setVisible(true);
				j4.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				JLabel num=new JLabel();
				num.setText("第几个：");
				num.setSize(60, 50);
		        num.setLocation(100, 40);
				JLabel name = new JLabel();
		        name.setText("名称：");
		        name.setSize(60, 50);
		        name.setLocation(100, 80);
		        JLabel kind = new JLabel();
		        kind.setText("类型：");
		        kind.setSize(50, 50);
		        kind.setLocation(100, 120);
		        JTextField numField = new JTextField();
		        numField.setSize(100, 20);
		        numField.setLocation(170, 55);
		        JTextField nameField = new JTextField();
		        nameField.setSize(100, 20);
		        nameField.setLocation(170, 95);
		        JTextField kindField = new JTextField();
		        kindField.setSize(100, 20);
		        kindField.setLocation(170, 135);
		        JButton ok = new JButton("OK");
		        ok.setSize(60,25);
		        ok.setLocation(135,260);
				c3.add(num);
				c3.add(name);
				c3.add(kind);
				c3.add(numField);
				c3.add(nameField);
				c3.add(kindField);
				c3.add(ok);
				ok.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						j4.dispose();
						int c = Integer.parseInt(numField.getText().trim());
						listall.get(c-1).SetName(nameField.getText());
						listall.get(c-1).SetKind(kindField.getText());
						listmodel.set(c-1, "第"+c+"个:"+listall.get(c-1).GetName()+"("+listall.get(c-1).GetKind()+")");
					}
				});
			}
		});
	    button5.setBounds(400,0,100,50);
	    c.add(button5);
	    
	    list.addMouseListener(new MouseAdapter() {
	    	public void mousePressed(MouseEvent e) {
	    		GUI2();
	    	}

			private void GUI2() {
				JButton nbutton1 = new JButton("新建");
	    		JButton nbutton2= new JButton("排序(名称)");
	    		JButton nbutton3 = new JButton("排序(类型)");
	    		JButton nbutton4 = new JButton("查找");
	    		JButton nbutton5 = new JButton("删除");
	    		JButton nbutton6 = new JButton("修改");

	    		DefaultListModel<String> listmodel1 = new DefaultListModel<String>();
	    		List<CYCLETASK> taskall = new ArrayList<CYCLETASK>();
	    		JList<String> list1 = new JList<String>(listmodel1);
	    		
	    		JFrame j5 = new JFrame();
				Container c4 = j5.getContentPane();
				c4.setLayout(null);
				j5.setTitle("任务");
				j5.setSize(500,500);
				j5.setVisible(true);
				j5.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				
				list1.setBounds(0,50,500,450);
				c4.add(list1);
				nbutton1.setBounds(0,0,100,50);
			    c4.add(nbutton1);
				nbutton2.setBounds(100,0,100,25);
			    c4.add(nbutton2);			    
			    nbutton3.setBounds(100,25,100,25);
			    c4.add(nbutton3);					    
			    nbutton4.setBounds(200,0,100,50);
			    c4.add(nbutton4);					    
			    nbutton5.setBounds(300,0,100,50);
			    c4.add(nbutton5);					    
			    nbutton6.setBounds(400,0,100,50);
			    c4.add(nbutton6);	
				
				nbutton1.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						JFrame j6 = new JFrame();
						Container c5 = j6.getContentPane();
						c5.setLayout(new GridLayout(9,3,10,10));
						j6.setTitle("新建任务");
						j6.setSize(500,400);
						j6.setVisible(true);
						j6.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
						
						JLabel type1 = new JLabel();
				        type1.setText("临时任务");
						JLabel name1 = new JLabel();
				        name1.setText("名称：");
				        JTextField nameField1 = new JTextField();
				        JLabel description1 = new JLabel();
				        description1.setText("备注：");
				        JTextField dField1 = new JTextField();
				        JRadioButton sign1 = new JRadioButton();
				        sign1.setText("状态");
				        JLabel date1 = new JLabel();
				        date1.setText("截止日期：");
				        JTextField dateField1 = new JTextField();
				        JButton ok1 = new JButton("OK");
				        ok1.setSize(60,25);
				        c5.add(type1);
						c5.add(name1);
						c5.add(nameField1);
						c5.add(description1);
						c5.add(dField1);
						c5.add(sign1);
						c5.add(date1);
						c5.add(dateField1);
						c5.add(ok1);
						
						JLabel type2 = new JLabel();
				        type2.setText("周期任务");
						JLabel name2 = new JLabel();
				        name2.setText("名称：");
				        JTextField nameField2 = new JTextField();
				        JLabel description2 = new JLabel();
				        description2.setText("备注：");
				        JTextField dField2 = new JTextField();
				        JRadioButton sign2 = new JRadioButton();
				        sign2.setText("状态");
				        JLabel date2 = new JLabel();
				        date2.setText("截止日期：");
				        JTextField dateField2 = new JTextField();
				        JLabel n2 = new JLabel();
				        n2.setText("重复次数：");
				        JTextField nField2 = new JTextField();
				        JLabel days2 = new JLabel();
				        days2.setText("重复周期：");
				        JTextField daysField2 = new JTextField();
				        JButton ok2 = new JButton("OK");
				        ok2.setSize(60,25);
				        c5.add(type2);
						c5.add(name2);
						c5.add(nameField2);
						c5.add(description2);
						c5.add(dField2);
						c5.add(sign2);
						c5.add(date2);
						c5.add(dateField2);
						c5.add(n2);
						c5.add(nField2);
						c5.add(days2);
						c5.add(daysField2);
						c5.add(ok2);
						
						ok1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								j6.dispose();
								listmodel1.addElement("名称："+nameField1.getText()+"      备注："+dField1.getText()+"      状态："+
										sign1.isSelected()+"      截止日期："+dateField1.getText());
								CYCLETASK taskone = new CYCLETASK(nameField1.getText(),dField1.getText(),
										sign1.isSelected(),dateField1.getText(),"","");
								taskone.SetFlag1(true);
								taskall.add(taskone);
								list1.setBounds(0,50,500,450);
								c4.add(list1);
							}
						});
						ok2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								j6.dispose();
								listmodel1.addElement("名称："+nameField2.getText()+"      备注："+dField2.getText()+"      状态："+sign2.isSelected()
								+"      截止日期："+dateField2.getText()+"      重复次数："+nField2.getText()+"      重复周期："+daysField2.getText());
								CYCLETASK taskone = new CYCLETASK(nameField2.getText(),dField2.getText(),
										sign2.isSelected(),dateField2.getText(),nField2.getText(),daysField2.getText());
								taskone.SetFlag1(false);
								taskall.add(taskone);
								list1.setBounds(0,50,500,450);
								c4.add(list1);
							}
						});
					}	
				});
				
				nbutton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String[] l = new String[5];
						int[] h = new int[5];
						int k = 0,c = 0,d = 0;
						String t;
						int t1;
						for(c = 0;c < taskall.size();c++,k++)
						{
							l[k] = taskall.get(c).GetName();
							h[k] = c;
						}
						k = 0;
						for(c = 0;c < taskall.size() - 1;c++)
						{
							String min = l[c];
							for(d = c + 1;d < taskall.size();d++,k++) {
								if(l[d].compareTo(min) < 0)
								{
									t = l[d];
									l[d] = l[c];
									l[c] = t;
									min = t;
									t1 = h[d];
									h[d] = h[c];
									h[c] = t1;
								}
							}
						}
						k = 0;
						((DefaultListModel<String>) list1.getModel()).removeAllElements();				
						for(d = 0;d < taskall.size();d++,k++) {
							if(taskall.get(h[k]).GetFlag1() == true) {
								listmodel1.addElement("名称："+taskall.get(h[k]).GetName()+"      备注："+taskall.get(h[k]).GetDescription()
										+"      状态："+taskall.get(h[k]).GetSign()+"      截止日期："+taskall.get(h[k]).GetDate());
							}else {
								listmodel1.addElement("名称："+taskall.get(h[k]).GetName()+"      备注："+taskall.get(h[k]).GetDescription()
										+"      状态："+taskall.get(h[k]).GetSign()+"      截止日期："+taskall.get(h[k]).GetDate()+"      重复次数："
										+taskall.get(h[k]).GetN()+"      重复周期："+taskall.get(h[k]).GetDays());
							}
						}	
					}
				});
				
				nbutton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String[] l = new String[5];
						int[] h = new int[5];
						int k = 0,c = 0,d = 0;
						String t;
						int t1;
						for(c = 0;c < taskall.size();c++,k++)
						{
							l[k] = taskall.get(c).GetDescription();
							h[k] = c;
						}
						k = 0;
						for(c = 0;c < taskall.size() - 1;c++)
						{
							String min = l[c];
							for(d = c + 1;d < taskall.size();d++,k++) {
								if(l[d].compareTo(min) < 0)
								{
									t = l[d];
									l[d] = l[c];
									l[c] = t;
									min = t;
									t1 = h[d];
									h[d] = h[c];
									h[c] = t1;
								}
							}
						}
						k = 0;
						((DefaultListModel<String>) list1.getModel()).removeAllElements();				
						for(d = 0;d < taskall.size();d++,k++) {
							if(taskall.get(h[k]).GetFlag1() == true) {
								listmodel1.addElement("名称："+taskall.get(h[k]).GetName()+"      备注："+taskall.get(h[k]).GetDescription()
										+"      状态："+taskall.get(h[k]).GetSign()+"      截止日期："+taskall.get(h[k]).GetDate());
							}else {
								listmodel1.addElement("名称："+taskall.get(h[k]).GetName()+"      备注："+taskall.get(h[k]).GetDescription()
										+"      状态："+taskall.get(h[k]).GetSign()+"      截止日期："+taskall.get(h[k]).GetDate()+"      重复次数："
										+taskall.get(h[k]).GetN()+"      重复周期："+taskall.get(h[k]).GetDays());
							}
						}	
					}
				});
				
				nbutton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame jf = new JFrame();
						Container c10 = jf.getContentPane();
						c10.setLayout(null);
						jf.setTitle("查询任务");
						jf.setSize(500,450);
						jf.setVisible(true);
						jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
						JLabel cname = new JLabel();
				        cname.setText("名称：");
				        cname.setSize(60, 50);
				        cname.setLocation(100, 80);
				        JTextField cnameField = new JTextField();
				        cnameField.setSize(100, 20);
				        cnameField.setLocation(170, 95); 
				        JButton oka = new JButton("OK");
				        oka.setSize(60,25);
				        oka.setLocation(135,260);
						c10.add(cname);
						c10.add(cnameField);
						c10.add(oka);
						
						oka.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String key = cnameField.getText();
								int m;
								if(key == null || key.trim().isEmpty()) {
									JOptionPane.showMessageDialog(jf, "请输入","",JOptionPane.WARNING_MESSAGE);
								}else {
									for(m = 0;m < taskall.size();m++) {
										if(taskall.get(m).GetName().contentEquals(key)) {
											list1.setSelectedIndex(m);
											break;
										}
									}
									if(m == taskall.size()) {
										list1.clearSelection();
										JOptionPane.showMessageDialog(jf, "没有此任务","",JOptionPane.WARNING_MESSAGE);
									}
								}
							}
						});
			    	}
				});
				
				nbutton5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			    		if(list1.getSelectedIndex()!=-1){
			    			taskall.remove(list1.getSelectedIndex());
			                listmodel1.remove(list1.getSelectedIndex());   
			            }
			    	}
				});
				
				nbutton6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(list1.getSelectedIndex()!=-1){ 
			                JFrame j6 = new JFrame();
							Container c5 = j6.getContentPane();
							c5.setLayout(new GridLayout(9,3,10,10));
							j6.setTitle("修改任务");
							j6.setSize(500,400);
							j6.setVisible(true);
							j6.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
							
							JLabel type1 = new JLabel();
					        type1.setText("临时任务");
							JLabel name1 = new JLabel();
					        name1.setText("名称：");
					        JTextField nameField1 = new JTextField();
					        JLabel description1 = new JLabel();
					        description1.setText("备注：");
					        JTextField dField1 = new JTextField();
					        JRadioButton sign1 = new JRadioButton();
					        sign1.setText("状态");
					        JLabel date1 = new JLabel();
					        date1.setText("截止日期：");
					        JTextField dateField1 = new JTextField();
					        JButton ok1 = new JButton("OK");
					        ok1.setSize(60,25);
					        c5.add(type1);
							c5.add(name1);
							c5.add(nameField1);
							c5.add(description1);
							c5.add(dField1);
							c5.add(sign1);
							c5.add(date1);
							c5.add(dateField1);
							c5.add(ok1);
							
							JLabel type2 = new JLabel();
					        type2.setText("周期任务");
							JLabel name2 = new JLabel();
					        name2.setText("名称：");
					        JTextField nameField2 = new JTextField();
					        JLabel description2 = new JLabel();
					        description2.setText("备注：");
					        JTextField dField2 = new JTextField();
					        JRadioButton sign2 = new JRadioButton();
					        sign2.setText("状态");
					        JLabel date2 = new JLabel();
					        date2.setText("截止日期：");
					        JTextField dateField2 = new JTextField();
					        JLabel n2 = new JLabel();
					        n2.setText("重复次数：");
					        JTextField nField2 = new JTextField();
					        JLabel days2 = new JLabel();
					        days2.setText("重复周期：");
					        JTextField daysField2 = new JTextField();
					        JButton ok2 = new JButton("OK");
					        ok2.setSize(60,25);
					        c5.add(type2);
							c5.add(name2);
							c5.add(nameField2);
							c5.add(description2);
							c5.add(dField2);
							c5.add(sign2);
							c5.add(date2);
							c5.add(dateField2);
							c5.add(n2);
							c5.add(nField2);
							c5.add(days2);
							c5.add(daysField2);
							c5.add(ok2);
							
							ok1.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									taskall.remove(list1.getSelectedIndex());
									listmodel1.remove(list1.getSelectedIndex());  
									j6.dispose();
									j6.dispose();
									listmodel1.addElement("名称："+nameField1.getText()+"      备注："+dField1.getText()+"      状态："+
											sign1.isSelected()+"      截止日期："+dateField1.getText());
									CYCLETASK taskone = new CYCLETASK(nameField1.getText(),dField1.getText(),
											sign1.isSelected(),dateField1.getText(),"","");
									taskone.SetFlag1(true);
									taskall.add(taskone);
									list1.setBounds(0,50,500,450);
									c4.add(list1);
								}
							});
							ok2.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									taskall.remove(list1.getSelectedIndex());
									listmodel1.remove(list1.getSelectedIndex());  
									j6.dispose();
									listmodel1.addElement("名称："+nameField2.getText()+"      备注："+dField2.getText()+"      状态："+sign2.isSelected()
									+"      截止日期："+dateField2.getText()+"      重复次数："+nField2.getText()+"      重复周期："+daysField2.getText());
									CYCLETASK taskone = new CYCLETASK(nameField2.getText(),dField2.getText(),
											sign2.isSelected(),dateField2.getText(),nField2.getText(),daysField2.getText());
									taskone.SetFlag1(false);
									taskall.add(taskone);
									list1.setBounds(0,50,500,450);
									c4.add(list1);
								}
							});
			            }
					}
				});
			}
	    });    
	}
}
