package com.canal.po;

import java.util.ArrayList;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPetIdIsNull() {
            addCriterion("pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNotNull() {
            addCriterion("pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetIdEqualTo(Integer value) {
            addCriterion("pet_id =", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotEqualTo(Integer value) {
            addCriterion("pet_id <>", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThan(Integer value) {
            addCriterion("pet_id >", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_id >=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThan(Integer value) {
            addCriterion("pet_id <", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_id <=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdIn(List<Integer> values) {
            addCriterion("pet_id in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotIn(List<Integer> values) {
            addCriterion("pet_id not in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_id between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_id not between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("hp is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("hp is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(Byte value) {
            addCriterion("hp =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Byte value) {
            addCriterion("hp <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Byte value) {
            addCriterion("hp >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Byte value) {
            addCriterion("hp >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Byte value) {
            addCriterion("hp <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Byte value) {
            addCriterion("hp <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Byte> values) {
            addCriterion("hp in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Byte> values) {
            addCriterion("hp not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Byte value1, Byte value2) {
            addCriterion("hp between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Byte value1, Byte value2) {
            addCriterion("hp not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andAttackIsNull() {
            addCriterion("attack is null");
            return (Criteria) this;
        }

        public Criteria andAttackIsNotNull() {
            addCriterion("attack is not null");
            return (Criteria) this;
        }

        public Criteria andAttackEqualTo(Byte value) {
            addCriterion("attack =", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotEqualTo(Byte value) {
            addCriterion("attack <>", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThan(Byte value) {
            addCriterion("attack >", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThanOrEqualTo(Byte value) {
            addCriterion("attack >=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThan(Byte value) {
            addCriterion("attack <", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThanOrEqualTo(Byte value) {
            addCriterion("attack <=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackIn(List<Byte> values) {
            addCriterion("attack in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotIn(List<Byte> values) {
            addCriterion("attack not in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackBetween(Byte value1, Byte value2) {
            addCriterion("attack between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotBetween(Byte value1, Byte value2) {
            addCriterion("attack not between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andDefenceIsNull() {
            addCriterion("defence is null");
            return (Criteria) this;
        }

        public Criteria andDefenceIsNotNull() {
            addCriterion("defence is not null");
            return (Criteria) this;
        }

        public Criteria andDefenceEqualTo(Byte value) {
            addCriterion("defence =", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceNotEqualTo(Byte value) {
            addCriterion("defence <>", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceGreaterThan(Byte value) {
            addCriterion("defence >", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceGreaterThanOrEqualTo(Byte value) {
            addCriterion("defence >=", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceLessThan(Byte value) {
            addCriterion("defence <", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceLessThanOrEqualTo(Byte value) {
            addCriterion("defence <=", value, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceIn(List<Byte> values) {
            addCriterion("defence in", values, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceNotIn(List<Byte> values) {
            addCriterion("defence not in", values, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceBetween(Byte value1, Byte value2) {
            addCriterion("defence between", value1, value2, "defence");
            return (Criteria) this;
        }

        public Criteria andDefenceNotBetween(Byte value1, Byte value2) {
            addCriterion("defence not between", value1, value2, "defence");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackIsNull() {
            addCriterion("special_attack is null");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackIsNotNull() {
            addCriterion("special_attack is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackEqualTo(Byte value) {
            addCriterion("special_attack =", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackNotEqualTo(Byte value) {
            addCriterion("special_attack <>", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackGreaterThan(Byte value) {
            addCriterion("special_attack >", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackGreaterThanOrEqualTo(Byte value) {
            addCriterion("special_attack >=", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackLessThan(Byte value) {
            addCriterion("special_attack <", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackLessThanOrEqualTo(Byte value) {
            addCriterion("special_attack <=", value, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackIn(List<Byte> values) {
            addCriterion("special_attack in", values, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackNotIn(List<Byte> values) {
            addCriterion("special_attack not in", values, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackBetween(Byte value1, Byte value2) {
            addCriterion("special_attack between", value1, value2, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialAttackNotBetween(Byte value1, Byte value2) {
            addCriterion("special_attack not between", value1, value2, "specialAttack");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceIsNull() {
            addCriterion("special_defence is null");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceIsNotNull() {
            addCriterion("special_defence is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceEqualTo(Byte value) {
            addCriterion("special_defence =", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceNotEqualTo(Byte value) {
            addCriterion("special_defence <>", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceGreaterThan(Byte value) {
            addCriterion("special_defence >", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceGreaterThanOrEqualTo(Byte value) {
            addCriterion("special_defence >=", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceLessThan(Byte value) {
            addCriterion("special_defence <", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceLessThanOrEqualTo(Byte value) {
            addCriterion("special_defence <=", value, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceIn(List<Byte> values) {
            addCriterion("special_defence in", values, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceNotIn(List<Byte> values) {
            addCriterion("special_defence not in", values, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceBetween(Byte value1, Byte value2) {
            addCriterion("special_defence between", value1, value2, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpecialDefenceNotBetween(Byte value1, Byte value2) {
            addCriterion("special_defence not between", value1, value2, "specialDefence");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Byte value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Byte value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Byte value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Byte value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Byte value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Byte value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Byte> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Byte> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Byte value1, Byte value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Byte value1, Byte value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Short value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Short value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Short value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Short value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Short value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Short value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Short> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Short> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Short value1, Short value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Short value1, Short value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}