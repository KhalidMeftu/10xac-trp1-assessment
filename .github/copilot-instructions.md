# AI Agent Instructions

## Reasoning and Approach
- Think step by step before answering or coding.
- Break down complex problems into smaller, manageable parts.
- Consider edge cases and potential pitfalls.
- Validate assumptions before proceeding—explicitly state them in your plan and confirm if needed.
- Use clear and concise language to explain your thought process.
- When coding, prioritize readability and maintainability.
- Test your solutions thoroughly to ensure correctness, using verification loops where possible (e.g., run tests, simulate scenarios, iterate until it works).
- If context is missing or the prompt is ambiguous, always ask clarifying questions before proceeding. For example, seek details on requirements, frameworks, constraints, or goals.
- Never generate code without explicit user confirmation after providing a plan and asking for clarifications.

## Project Overview
This repository contains my work for the TRP 1 MCP Setup Challenge at 10 Academy.
Goal: Configure effective rules for AI coding agent, document process, show curiosity & troubleshooting.

## Core Principles
- Be precise, structured, and explicit in responses.
- Always plan before writing code: outline steps, risks, verification methods, and any ambiguities.
- Use TDD when appropriate: suggest/write tests first.
- Follow clean code: meaningful names, small functions, type hints (if Python), docstrings.
- Invest in verification: Provide ways to check work (e.g., tests, linters, manual simulations) to improve output quality 2-3x.
- Maintain and update these rules: If I do something incorrectly, note it here to avoid repetition (inspired by shared docs in team workflows).

## Handling Ambiguous or Vague Prompts
- If a prompt lacks details (e.g., "kotlin login logout" or "write it"), do not generate code immediately. Instead:
  1. Reply with clarifying questions: What language/framework (e.g., Kotlin with Spring Boot, Ktor, Android Jetpack Compose)? Specific features (e.g., authentication type like JWT/OAuth, database integration, UI/endpoint)? Error handling, security, async ops?
  2. Outline a high-level plan based on assumptions.
  3. Ask for confirmation: "Does this plan align? Any changes before proceeding?"
- Assume nothing critical—always validate key assumptions in your response and wait for user approval.

## Workflow Rules
1. For any coding task (e.g., "fix bug", "implement feature", "write code", or vague like "kotlin login logout" or "write it"), first reply with:
   - Clarifying questions if needed.
   - A detailed plan: Steps, assumptions, risks, edge cases, verification strategy.
   - Wait for user confirmation before coding.
2. After user approval, generate code modularly.
3. After changes, suggest running relevant tests, linters, or formatters (e.g., ktlint for Kotlin, black for Python).
4. Prefer modular, readable code over clever one-liners.
5. For repetitive tasks, suggest or use custom commands/workflows if supported by the IDE (e.g., commit-push patterns).
6. End with verification: Suggest/run checks and iterate if issues arise.

## Coding Style (Adapt to Language)
- Python: PEP 8, type hints, black formatting.
- Kotlin: Follow official Kotlin style guide; use idiomatic features like data classes, coroutines for async; prefer null safety (no !! operator unless necessary); meaningful naming; keep functions concise (<20 lines ideal); use sealed classes for errors.
- Commit messages: Conventional commits (feat:, fix:, chore: etc.).
- General: Use linters/formatters automatically if possible; avoid common pitfalls by adding corrections here over time.

## Testing & Iteration
- After updating rules, test with simple prompts like "Explain this function", "Suggest refactor", or vague ones like "kotlin login logout" or "write it" to ensure you ask questions, provide plans, and seek confirmation.
- If behavior doesn't align (e.g., generating code without clarification), update this file to correct it.