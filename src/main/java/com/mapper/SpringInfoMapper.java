package com.mapper;
import com.model.Quote;
import com.model.Value;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.*;




    @Mapper
    public interface SpringInfoMapper {


        String INSERT_Value = "INSERT INTO `Spring_Info`.`Value` (`id`, `quote`) VALUES " + "(#{id}, #{quote})";

        String INSERT_Quote = "INSERT INTO `Spring_Info`.`Quote` (`type`) VALUES " + "(#{type})";


        @Insert(INSERT_Value)
        public int insertValue(Value value);

        @Insert(INSERT_Quote)
        public int insertQuote(Quote quote);


    }
