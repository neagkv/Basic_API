package com.mapper;
import com.model.Quote;
import com.model.Value;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.*;




    @Mapper
    public interface SpringInfoMapper {


        //inserts the the nested JSON object
        String INSERT_Value = "INSERT INTO `Spring_Info`.`Value` (`id`, `quote`) VALUES " + "(#{id}, #{quote})";

        //inserts the outer JSON object
        String INSERT_Quote = "INSERT INTO `Spring_Info`.`Quote` (`type`) VALUES " + "(#{type})";

        //Selects the id from the inner JSON object. this will allow us to check if it already exists later on.
        String GET_Value_By_ID = "Select id from `spring_Info`.`Value` where id = #{id} limit 1";

        //these methods take the database queries from above and map them into methods in the service class
        @Select(GET_Value_By_ID)
        public Value getValueById(long id);

        @Insert(INSERT_Value)
        public int insertValue(Value value);

        @Insert(INSERT_Quote)
        public int insertQuote(Quote quote);



    }
