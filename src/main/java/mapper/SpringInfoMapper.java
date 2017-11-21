package mapper;
import model.Quote;
import model.Value;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.*;




    @Mapper
    public interface SpringInfoMapper {


        String INSERT_Value = "INSERT INTO `Spring_info`.`Value` (`quote`) VALUES " + "(#{quote}";

        String INSERT_Quote = "INSERT INTO `Spring_info`.`Quote` (`type`, `value`) VALUES " + "(#{type}, {#value})";


        @Insert(INSERT_Value)
        public int insertValue(Value value);

        @Insert(INSERT_Quote)
        public int insertQuote(Quote quote);


    }
