package name
import chisel3._

import chisel3.experimental.ChiselEnum
import chisel3.util._


object Name extends App {
  (new chisel3.stage.ChiselStage).emitVerilog(new Name(), Array("--target-dir","generated"))
}


class Name() extends Module {
    val io =IO(new Bundle{
        //io Declare
        //val in = Flipped(new DecoupledIO(UInt(8.W)))
        //val out = new DecoupledIO(UInt(8.W))
    })
//Body
}

