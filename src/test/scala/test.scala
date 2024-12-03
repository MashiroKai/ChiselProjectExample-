import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import name.Name

class NameTest extends AnyFlatSpec with ChiselScalatestTester {
"NameTest" should "pass" in 
{ test(new Name()) 
.withAnnotations(Seq(WriteVcdAnnotation)) {
dut => 

/*
    var valid = dut.io.mode.peekBoolean()
    println(s" valid is $valid ")
    for(i <- 0 until 4){
    dut.io.wr.bits.poke(temp(i).U)
    dut.io.wr.valid.poke(true.B)
    dut.clock.step()
    }
*/

}
}
}