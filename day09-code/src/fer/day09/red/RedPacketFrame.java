package fer.day09.red;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 20:24
 * 
 * 红包的框架 RedPacketFrame
 * AWT / Swing / JavaFX
 **/
public abstract class RedPacketFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private static final String DIR = "day09-code\\pic";

    private ArrayList<Integer> moneyList = null;

    private static int initMoney = 0;
    private static int totalMoney = 0;
    private static int count = 0;

    private static final HashMap<JPanel, JLabel> PANEL_LABLE = new HashMap<>();


    private static final Font FONT_YA_HEI = new Font("微软雅黑", Font.BOLD, 20);
    private static final Font MSG_FONT = new Font("微软雅黑", Font.BOLD, 20);
    private static final Font TOTAL_SHOW_FONT = new Font("微软雅黑", Font.BOLD, 40);
    private static final Font NAME_FONT = new Font("微软雅黑", Font.BOLD, 40);
    private static final Font SHOW_NAME_FONT = new Font("微软雅黑", Font.BOLD, 20);
    private static final Font SHOW_MONEY_FONT = new Font("微软雅黑", Font.BOLD, 50);
    private static final Font SHOW_RESULT_FONT = new Font("微软雅黑", Font.BOLD, 15);

    /**
     * 窗体大小 WIDTH:400 HEIGHT:600
     */
    private static final int FRAME_WIDTH = 416; 
    private static final int FRAME_HEIGHT = 650;
    private static JLayeredPane layeredPane = null;
    

    /**
     * page1:输入页面 - InputPanel . 组件和初始化!
     */
    private static final JPanel INPUT_PANEL = new JPanel();


    private static final JTextField INPUT_TOTAL = new JTextField();
    private static final JTextField INPUT_COUNT = new JTextField();
    private static final JTextField INPUT_PEOPLE = new JTextField("30");
    private static final JTextField INPUT_MSG = new JTextField("恭喜发财  ,  大吉大利");
    private static final JTextField INPUT_TOTAL_SHOW = new JTextField("$ " + INPUT_TOTAL.getText().trim());
    /**
     * 不可见
     */
    private static final JLabel INPUT_IN_MONEY = new JLabel(); 
    private static final JLabel INPUT_BG_LABEL = new JLabel(new ImageIcon(DIR + "\\01_input.jpg"));

    static {

        // 设置位置
        INPUT_TOTAL.setBounds(200, 90, 150, 50);
        INPUT_COUNT.setBounds(200, 215, 150, 50);
        INPUT_PEOPLE.setBounds(90, 275, 25, 30);
        INPUT_MSG.setBounds(180, 340, 200, 50);
        INPUT_TOTAL_SHOW.setBounds(130, 430, 200, 80);
        INPUT_IN_MONEY.setBounds(10, 535, 380, 65);
        // 背景
        INPUT_BG_LABEL.setBounds(0, 0, 400, 600); 

        // 设置字体
        INPUT_TOTAL.setFont(FONT_YA_HEI);
        INPUT_COUNT.setFont(FONT_YA_HEI);
        INPUT_PEOPLE.setFont(FONT_YA_HEI);
        INPUT_MSG.setFont(MSG_FONT);
        // 字体颜色 为金色
        INPUT_MSG.setForeground(new Color(255, 233, 38)); 
        INPUT_TOTAL_SHOW.setFont(TOTAL_SHOW_FONT);
        INPUT_IN_MONEY.setFont(FONT_YA_HEI);

        // 透明
        INPUT_PEOPLE.setOpaque(false);
        INPUT_TOTAL_SHOW.setOpaque(false);
        // 编 辑 -- 不可编辑
        INPUT_PEOPLE.setEditable(false);
        INPUT_TOTAL_SHOW.setEditable(false);

        // 边界 -- 无
        INPUT_TOTAL.setBorder(null);
        INPUT_COUNT.setBorder(null);
        INPUT_PEOPLE.setBorder(null);
        INPUT_MSG.setBorder(null);
        INPUT_TOTAL_SHOW.setBorder(null);

    }

    /**
     * page2:打开页面 - OPEN_PANEL . 组件和初始化!
     */
    private static final JPanel OPEN_PANEL = new JPanel();

    private static final JTextField OPEN_OWNER_NAME = new JTextField("谁谁谁");
    private static final JLabel OPEN_LABEL = new JLabel(new ImageIcon(DIR + "\\02_open_2.gif"));
    private static final JLabel OPEN_BG_LABEL = new JLabel(new ImageIcon(DIR + "\\02_open_1.jpg"));

    static {

        // 设置 位置.
        OPEN_OWNER_NAME.setBounds(0, 110, 400, 50);
        OPEN_BG_LABEL.setBounds(0, 0, 400, 620);
        OPEN_LABEL.setBounds(102, 280, 200, 200);
        OPEN_OWNER_NAME.setHorizontalAlignment(JTextField.CENTER);

        // 设置字体
        OPEN_OWNER_NAME.setFont(NAME_FONT);
        // 字体颜色 为金色
        OPEN_OWNER_NAME.setForeground(new Color(255, 200, 163));
        
        OPEN_OWNER_NAME.setBackground(new Color(219, 90, 68));

        // 不可编辑
        OPEN_OWNER_NAME.setEditable(false);
        // 边框
        OPEN_OWNER_NAME.setBorder(null);

    }

    /**
     * page3:展示页面 - SHOW_PANEL . 组件和初始化!
     */
    private static final JPanel SHOW_PANEL = new JPanel();
    private static final JPanel SHOW_PANEL2 = new JPanel();
    private static final JScrollPane SHOW_JSP = new JScrollPane(SHOW_PANEL2);

    private static final JLabel SHOW_BG_LABEL = new JLabel(new ImageIcon(DIR + "\\03_money_1.jpg"));

    private static final JTextField SHOW_NAME = new JTextField("用户名称");
    private static final JTextField SHOW_MSG = new JTextField("祝福信息");
    private static final JTextField SHOW_MONEY = new JTextField("99.99");
    private static final JTextField SHOW_RESULT = new JTextField(count + "个红包共" + (totalMoney / 100.0) + "元,被抢光了");

    static {
        /*
         * 两部分 页面 . 1.本人获得的红包-- SHOW_PANEL 2.别人获得的红包-- SHOW_JSP
         */
        SHOW_NAME.setBounds(125, 180, 100, 30);
        SHOW_NAME.setOpaque(false);
        SHOW_NAME.setBorder(null);
        SHOW_NAME.setFont(SHOW_NAME_FONT);

        SHOW_MSG.setBounds(0, 220, 400, 30);
        SHOW_MSG.setOpaque(false);
        SHOW_MSG.setBorder(null);
        SHOW_MSG.setFont(MSG_FONT);
        SHOW_MSG.setHorizontalAlignment(JTextField.CENTER);

        SHOW_MONEY.setBounds(0, 270, 250, 40);
        SHOW_MONEY.setOpaque(false);
        SHOW_MONEY.setBorder(null);
        SHOW_MONEY.setFont(SHOW_MONEY_FONT);
        // 字体颜色 为金色
        SHOW_MONEY.setForeground(new Color(255, 233, 38)); 
        SHOW_MONEY.setHorizontalAlignment(SwingConstants.RIGHT);

        SHOW_RESULT.setBounds(10, 460, 400, 20);
        SHOW_RESULT.setOpaque(false);
        SHOW_RESULT.setBorder(null);
        SHOW_RESULT.setFont(SHOW_RESULT_FONT);
        // 字体颜色 为灰色
        SHOW_RESULT.setForeground(new Color(170, 170, 170)); 

        // 设置 图片.
        SHOW_BG_LABEL.setBounds(0, 0, 400, 500);

    }

    static {

        // 页面和 背景的对应关系.
        PANEL_LABLE.put(INPUT_PANEL, INPUT_BG_LABEL);
        PANEL_LABLE.put(OPEN_PANEL, OPEN_BG_LABEL);
        PANEL_LABLE.put(SHOW_PANEL, SHOW_BG_LABEL);
    }

    private void init() {
        // 层次面板-- 用于设置背景
        layeredPane = this.getLayeredPane();

        // 初始化框架 -- logo 和基本设置
        initFrame();
        // 初始化 三个页面 -- 准备页面
        initPanel();

        // 2.添加 页面 --第一个页面, 输入 panel 设置到 页面上.
        setPanel(INPUT_PANEL);

        // 3.添加 监听
        addListener();
    }


    /**
     * 初始化框架 -- logo 和基本设置
     */
    private void initFrame() {
        // logo
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(DIR + "\\logo.gif"));
        System.out.println("LOGO初始化...");

        // 窗口设置,设置界面大小
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        // 设置界面出现的位置
        this.setLocation(280, 30); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        // 测试期 注释 拖 拽 , 运行放开
        // this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * 初始化页面-- 准备三个页面
     */

    private void initPanel() {
        System.out.println("页面初始化...");
        initInputPanel();
        initOpenPanel();
        initShowPanel();

    }

    private void initInputPanel() {

        INPUT_PANEL.setLayout(null);
        INPUT_PANEL.setBounds(0, -5, 400, 600);

        // this.add(bg_label);
        INPUT_PANEL.add(INPUT_TOTAL);
        INPUT_PANEL.add(INPUT_COUNT);
        INPUT_PANEL.add(INPUT_PEOPLE);
        INPUT_PANEL.add(INPUT_MSG);
        INPUT_PANEL.add(INPUT_TOTAL_SHOW);
        INPUT_PANEL.add(INPUT_IN_MONEY);

    }

    private void initOpenPanel() {
        OPEN_PANEL.setLayout(null);
        OPEN_PANEL.setBounds(0, 0, 400, 600);
        // this.add(bg_label);
        OPEN_PANEL.add(OPEN_OWNER_NAME);
        OPEN_PANEL.add(OPEN_LABEL);
//        System.out.println("打开页面||" + OPEN_PANEL);
    }

    private void initShowPanel() {
        SHOW_PANEL.setLayout(null);
        SHOW_PANEL.setBounds(10, 10, 300, 600);

        SHOW_PANEL.add(SHOW_NAME);
        SHOW_PANEL.add(SHOW_MSG);
        SHOW_PANEL.add(SHOW_MONEY);
        SHOW_PANEL.add(SHOW_RESULT);

        SHOW_PANEL2.setPreferredSize(new Dimension(300, 1000));
        SHOW_PANEL2.setBackground(Color.white);

        SHOW_JSP.setBounds(0, 500, 400, 110);

    }

    /**
     * 每次打开页面, 设置 panel的方法
     */
    private void setPanel(JPanel panel) {
        // 移除当前页面
        layeredPane.removeAll();

        // 背景lable添加到layeredPane的默认层
        layeredPane.add(PANEL_LABLE.get(panel), JLayeredPane.DEFAULT_LAYER);

        // 面板panel设置为透明
        panel.setOpaque(false);

        // 面板panel 添加到 layeredPane的modal层
        layeredPane.add(panel, JLayeredPane.MODAL_LAYER);
    }
    

    /**
     * 设置组件的监听器
     */
    private void addListener() {

        INPUT_TOTAL.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String inputTotalMoney = INPUT_TOTAL.getText();
                INPUT_TOTAL_SHOW.setText("$ " + inputTotalMoney);
            }
        });

        INPUT_COUNT.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        INPUT_MSG.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        INPUT_IN_MONEY.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    // 获取页面的值.
                    totalMoney = (int) (Double.parseDouble(INPUT_TOTAL.getText()) * 100); // 转换成"分"
                    count = Integer.parseInt(INPUT_COUNT.getText());
                    if (count > 30) {
                        JOptionPane.showMessageDialog(null, "红包个数不得超过30个", "红包个数有误", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    initMoney = totalMoney;

                    System.out.println("总金额：[" + totalMoney + "]分");
                    System.out.println("红包个数：[" + count + "]个");

                    INPUT_IN_MONEY.removeMouseListener(this);

                    // 设置群主名称
                    OPEN_OWNER_NAME.setText(ownerName);
                    // 设置打开页面
                    setPanel(OPEN_PANEL);

                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "请输入正确【总金额】或【红包个数】", "输入信息有误", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        // OPEN_OWNER_NAME ,点击 [名称],触发的方法 , 提示如何设置群主名称.
        OPEN_OWNER_NAME.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                JOptionPane.showMessageDialog(null, "请通过【setOwnerName】方法设置群主名称", "群主名称未设置",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });

        // open label , 点击 [开],触发的方法,提示如何设置打开方式.
        OPEN_LABEL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (openWay == null) {
                    JOptionPane.showMessageDialog(null, "请通过【setOpenWay】方法设置打开方式", "打开方式未设置",
                            JOptionPane.QUESTION_MESSAGE);
                    return;
                }


                moneyList = openWay.divide(totalMoney, count);

                /*
                 * SHOW_PANEL 添加数据
                 *
                 */
                SHOW_NAME.setText(ownerName);
                SHOW_MSG.setText(INPUT_MSG.getText());
                if (moneyList.size() > 0) {
                    SHOW_MONEY.setText(moneyList.get(moneyList.size() - 1) / 100.0 + "");
                }
                SHOW_RESULT.setText(count + "个红包共" + (initMoney / 100.0) + "元,被抢光了");

                OPEN_LABEL.removeMouseListener(this);

                setPanel(SHOW_PANEL);

                // 添加数据
                for (int i = 0; i < moneyList.size(); i++) {

                    JTextField tf = new JTextField();
                    tf.setBorder(null);
                    tf.setFont(SHOW_NAME_FONT);
                    tf.setHorizontalAlignment(JTextField.LEFT);
                    if (i == moneyList.size() - 1) {
                        tf.setText(ownerName + "：\t" + moneyList.get(i) / 100.0 + "元");

                    } else {

                        tf.setText("群成员-" + i + "：\t" + moneyList.get(i) / 100.0 + "元");
                    }
                    SHOW_PANEL2.add(tf);
                }

                layeredPane.add(SHOW_JSP, JLayeredPane.MODAL_LAYER);
            }

        });

    }

    /* ======================================================================
     * **********************************************************************
     * * 以上代码均为页面部分处理,包括布局/互动/跳转/显示等						*
     * *																	*
     * *																	*
     * **********************************************************************
     * ======================================================================
     */

    /**
     * ownerName : 群主名称
     */
    private String ownerName = "谁谁谁";
    /**
     * openWay : 红包的类型 [普通红包/手气红包]
     */
    private OpenMode openWay = null;


    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */

    public RedPacketFrame(String title) {
        super(title);

        // 页面相关的初始化
        init();
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOpenWay(OpenMode openWay) {
        this.openWay = openWay;
    }


}
