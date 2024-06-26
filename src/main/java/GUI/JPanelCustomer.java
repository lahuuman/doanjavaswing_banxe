/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BUS.customerBll;
import DTO.customerDto;
import DTO.employeeDto;

/**
 *
 * @author voota
 */
public class JPanelCustomer extends javax.swing.JPanel {
	customerBll cusbll=new customerBll();
    /**
     * Creates new form JPanelQuanLyNhanVien
     */
    public JPanelCustomer() {
        initComponents();
        this.setSize(960,700);
        this.setVisible(true);
        loadEmployeeList();
    }

   

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	;
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldCustomerId = new javax.swing.JTextField();
        textFieldCustomerName = new javax.swing.JTextField();
        textFieldCustomerAddress = new javax.swing.JTextField();
        textFieldCustomerPhone = new javax.swing.JTextField();
        textFieldCustomerCart = new javax.swing.JTextField();
        textFieldCustomerCost = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonFix = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonShowAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldSearchCustomerId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textFieldSearchNameCustomer = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();

        jLabel2.setText("Mã khách hàng");
        textFieldCustomerId.setEditable(false);
        jLabel3.setText("Họ và Tên");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Số điện thoại");

        jLabel6.setText("Cart");

        jLabel7.setText("Tổng chi");
        
        jTable6.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int row= jTable6.getSelectedRow();
			      if(row<0) {
			    	  return ;
			      }
			    String name=String.valueOf(jTable6.getValueAt(row, 1));
				String id=String .valueOf(jTable6.getValueAt(row,0));
				String address=String.valueOf(jTable6.getValueAt(row, 2));
				String Phone=String.valueOf(jTable6.getValueAt(row, 3));
				textFieldCustomerId.setText(id);
				textFieldCustomerName.setText(name);
				textFieldCustomerAddress.setText(address);
				
				textFieldCustomerPhone.setText(Phone);
				System.out.println(id);
				
			}
				
		});

        textFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerIdActionPerformed(evt);
            }
        });

        textFieldCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerNameActionPerformed(evt);
            }
        });

        textFieldCustomerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerAddressActionPerformed(evt);
            }
        });

        textFieldCustomerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerPhoneActionPerformed(evt);
            }
        });

        textFieldCustomerCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerCartActionPerformed(evt);
            }
        });

        textFieldCustomerCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustomerCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldCustomerId)
                    .addComponent(textFieldCustomerCart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(textFieldCustomerPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldCustomerAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldCustomerCost)
                    .addComponent(textFieldCustomerName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldCustomerCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textFieldCustomerCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Icon\\them.png")); // NOI18N
        buttonAdd.setText("Thêm");
        buttonAdd.setBorderPainted(false);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	System.out.println(1);
            	try {
					if(
			    			textFieldCustomerName.getText().trim().equals("") || 
			    			textFieldCustomerAddress.getText().trim().equals("") || 
			    			textFieldCustomerPhone.getText().trim().equals("")) 
					      
				JOptionPane.showMessageDialog(null,"Vui lòng nhập đủ thông tin");
					else {
						
						LocalDateTime currentDate = LocalDateTime.now();
						
						String dateString ="KH"+"-"+currentDate+"";
						String employeeCode =dateString;
						customerDto em = new customerDto();
						em.setCustomerID(employeeCode);
						em.setName(textFieldCustomerName.getText());
						em.setAddress(textFieldCustomerAddress.getText());
						em.setPhone(textFieldCustomerPhone.getText());
						System.out.print(em);
						JOptionPane.showMessageDialog(null,cusbll.addCustomer(em) );loadEmployeeList(); }
					 }catch (Exception ex) {
						JOptionPane.showMessageDialog(null,ex);
						JOptionPane.showMessageDialog(null,"sai");
					
				}
            }

			
        });


        buttonFix.setForeground(new java.awt.Color(255, 255, 255));
        buttonFix.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Icon\\sua.png")); // NOI18N
        buttonFix.setText("Sửa");
        buttonFix.setBorderPainted(false);
        buttonFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					if(
			    			textFieldCustomerName.getText().trim().equals("") || 
			    			textFieldCustomerAddress.getText().trim().equals("") || 
			    			textFieldCustomerPhone.getText().trim().equals("")) 
					      
				JOptionPane.showMessageDialog(jPanel1,"Vui lòng nhập đủ thông tin trước khi sửa");
					else {
						
					
						String employeeCode =textFieldCustomerId.getText();
						customerDto em = new customerDto ();
						em.setCustomerID(employeeCode);
						em.setName(textFieldCustomerName.getText());
						em.setAddress(textFieldCustomerAddress.getText());
						em.setPhone(textFieldCustomerPhone.getText());
						System.out.print(em);
						JOptionPane.showMessageDialog(jPanel1, cusbll.fixCustomer(employeeCode, em));loadEmployeeList(); }
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(jPanel1,ex);
						JOptionPane.showMessageDialog(jPanel1,"sai");
					
				}

				 
            }
        });

        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Icon\\xoa.png")); // NOI18N
        buttonDelete.setText("Xóa");
        buttonDelete.setBorderPainted(false);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
						String employeeCode =textFieldCustomerId.getText();
						JOptionPane.showMessageDialog(jPanel1, cusbll.deleteCustomer(employeeCode));loadEmployeeList(); }
            	catch (Exception ex) {
					JOptionPane.showMessageDialog(jPanel1,ex);
					JOptionPane.showMessageDialog(jPanel1,"sai");
					}
					
				}
           

			
        });
        buttonShowAll.setForeground(new java.awt.Color(255, 255, 255));
        buttonShowAll.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Icon\\xemTatCa.png")); // NOI18N
        buttonShowAll.setText("Làm mới");
        buttonShowAll.setBorderPainted(false);
        buttonShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	textFieldCustomerId.setText("");
            	textFieldCustomerPhone.setText("");
            	textFieldCustomerName.setText("");
            	textFieldCustomerAddress.setText("");
            	textFieldSearchCustomerId.setText("");
            	textFieldSearchNameCustomer.setText("");
            	loadEmployeeList();
            }

			
        });
        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonShowAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonFix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonFix, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Image\\avatarKhachHang.png")); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Tìm kiếm");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã khách hàng");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        textFieldSearchCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchCustomerIdActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Họ và Tên");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        textFieldSearchNameCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchNameCustomerActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldSearchNameCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 250, 30));

        buttonSearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch.setIcon(new javax.swing.ImageIcon("D:\\Cá Nhân\\Pictures\\Saved Pictures\\Icon\\timKiem.png")); // NOI18N
        buttonSearch.setText("Tìm kiếm");
        buttonSearch.setBorderPainted(false);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(
		    			textFieldSearchCustomerId.getText().trim().equals("") || 
		    			textFieldSearchNameCustomer.getText().trim().equals("")
		    			)  {
              	   JOptionPane.showMessageDialog(null,"Vui lòng nhập thông tin vào ô tìm kiếm họ và tên và mã khách hàng");
                 }else {
              	   ArrayList<customerDto> arr = new ArrayList<customerDto>();
              	   arr=cusbll.findAllCustomer(textFieldSearchCustomerId.getText(),textFieldSearchNameCustomer.getText());
              	   if(arr!=null) {
              		 DefaultTableModel dtm = new DefaultTableModel();
              		dtm.addColumn("Mã khách hàng");
              		dtm.addColumn("Tên");
              		dtm.addColumn("Địa chỉ");
              		dtm.addColumn("Số điện thoại");
              		jTable6.setModel(dtm);
           
              	
              				for(int i = 0; i < arr.size(); i++){
              			customerDto cus = arr.get(i);
              			String id =  cus.getCustomerID();
              			String name = cus.getName();  
              			String Address = cus.getAddress();
              			String Phone= cus.getPhone();
              			Object[] row = {id,name,Address,Phone};
              			dtm.addRow(row);
              		}
              	   }
              	   else{JOptionPane.showMessageDialog(null,"Không có khách hàng nào có tên và mã này");}
                 }
            }
        });
        jPanel3.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 140, 46));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Thông tin khách hàng");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ", "Tên", "Địa chỉ", "Số điện thoại", "Cart", "Tổng chi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        scrollPane2.add(jScrollPane6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerIdActionPerformed

    private void textFieldCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerNameActionPerformed

    private void textFieldCustomerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerAddressActionPerformed

    private void textFieldCustomerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerPhoneActionPerformed

    private void textFieldCustomerCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerCartActionPerformed

    private void textFieldCustomerCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustomerCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustomerCostActionPerformed

    private void textFieldSearchCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSearchCustomerIdActionPerformed

    private void textFieldSearchNameCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchNameCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSearchNameCustomerActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonFix;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShowAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable6;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTextField textFieldCustomerAddress;
    private javax.swing.JTextField textFieldCustomerCart;
    private javax.swing.JTextField textFieldCustomerCost;
    private javax.swing.JTextField textFieldCustomerId;
    private javax.swing.JTextField textFieldCustomerName;
    private javax.swing.JTextField textFieldCustomerPhone;
    private javax.swing.JTextField textFieldSearchCustomerId;
    private javax.swing.JTextField textFieldSearchNameCustomer;
    // End of variables declaration//GEN-END:variables
    public void loadEmployeeList(){
 		DefaultTableModel dtm = new DefaultTableModel();
 		dtm.addColumn("Mã khách hàng");
 		dtm.addColumn("Tên");
 		dtm.addColumn("Địa chỉ");
 		dtm.addColumn("Số điện thoại");
 		jTable6.setModel(dtm);
 		ArrayList<customerDto> arr = new ArrayList<customerDto>();
 		arr = cusbll.getAllCustomer();
 				for(int i = 0; i < arr.size(); i++){
 			customerDto cus = arr.get(i);
 			String id =  cus.getCustomerID();
 			String name = cus.getName();  
 			String Address = cus.getAddress();
 			String Phone= cus.getPhone();
 			Object[] row = {id,name,Address,Phone};
 			dtm.addRow(row);
 		}
}
}