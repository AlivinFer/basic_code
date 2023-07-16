package fer.day09.demo07;

/**
 * @author: Alivin Fer
 * @date: 2020/11/8 16:29
 *
 * 接口作为成员变量类型
 **/

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        // 设置英雄的名称
        hero.setName("艾希");

        // 设置英雄技能，使用单独定义的实现类
        hero.setSkill(new SkillImpl());

        // 还可以使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Hei~hei~hei");
            }
        };
        hero.setSkill(skill);

        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pia");
            }
        });

        hero.attack();
    }
}
