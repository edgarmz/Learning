package com.edgmed.DIdemo;

public class CodeEditor {
    private SintaxisChecker sintaxisChecker;


    public CodeEditor() {
    }
    public CodeEditor(SintaxisChecker sintasisChecker) {
        System.out.println("Code Editor initialized");
        this.sintaxisChecker = sintasisChecker;
    }

    public void setSintaxisChecker(SintaxisChecker sinChecker){
        System.out.println("Setting  sintaxisChecker initialized");
        this.sintaxisChecker = sinChecker;
    }
    public void compile(){
        System.out.println("Start compilation");
        this.sintaxisChecker.validSintaxis("code");
    }
}
