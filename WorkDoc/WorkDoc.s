	.file	"WorkDoc.c"
	.text
	.globl	currState
	.data
	.align 4
	.type	currState, @object
	.size	currState, 4
currState:
	.long	2
	.text
	.globl	FindState
	.type	FindState, @function
FindState:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	currState(%rip), %eax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	FindState, .-FindState
	.section	.rodata
.LC0:
	.string	"WORKING"
.LC1:
	.string	"NOT WORKING"
	.text
	.globl	main
	.type	main, @function
main:
.LFB1:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	$0, %eax
	call	FindState
	testl	%eax, %eax
	jne	.L4
	leaq	.LC0(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	jmp	.L5
.L4:
	leaq	.LC1(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
.L5:
	movl	$0, %eax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1:
	.size	main, .-main
	.ident	"GCC: (Ubuntu 7.3.0-27ubuntu1~18.04) 7.3.0"
	.section	.note.GNU-stack,"",@progbits
