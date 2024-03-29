package fer.day09.demo07;

/**
 * @author: Alivin Fer
 * @date: 2020/11/8 16:25
 **/

public class Hero {

    /**
     * 英雄名称
     */
    private String name;
    /**
     * 英雄技巧(接口作为成员变量类型)
     */
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("我叫" + name + ", 开始施放技能：");
        skill.use();
        System.out.println("释放技能完成。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
