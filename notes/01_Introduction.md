# Введение в симуляцию

**Симуляция** - имитация поведения системы из реального мира во времени.

Симуляция создает искусственную историю системы, по которой можно делать выводы о характеристиках системы.

Симуляции не следует использовать там, где

- можно справится математическими методами,
- легко поставить эксперимент,
- стоимость симуляции превышает выигрыш,
- нельзя контролировать время,
- нет входных данных,
- нельзя проверить корректность симуляиции,
- когда поведение системы слишком сложно или не определено.

Например, не следует симулировать поведение человеков.


**Система** - группа объектов связанных между собой частым взаимодействием или взаимозависимостью для выполнения какой-то цели.
Важно определить границы системы: что мы считаем частью системы, а что ее окружением. Этот решение зависит от цели изучения.

Основые термины:
- **Entity** - Object of interest in the system.
- **Attribute** - Property of an entity.
- **Activity** - A time period of specified length.
- **System state** - Collection of variables required to describe• System state Collection of variables required to describe
  the system at any time.
- **Event** - An instantaneous occurrence that might change the state of the system.
- **Endogenous** - Activities and Events occurring within the systemsystem.
- **Exogenous** - Activities and Events in the environment (outside the system) that affect the system.

Классификация "Дискретные и непрерывные" сисемы:
- Discrete:  State variables change only at discrete set of points, e.g. jobs in queue, Bank.
- Continuous Systems: State variables change continuously over time, e.g. temperature.

**Модель** - это представление системы с целью её изучения.
- Важно учитывать аспекты системы, которые влияют на решение исследуемой проблемы.
- Следует избегать слишком большой диталезации.

> “The tendency is nearly always toThe tendency is nearly always to simulate too much detail rather than
> too little Thus one should alwaystoo little. Thus, one should always design the model around the
> question to be answered rather thanquestion to be answered rather than imitate the real system exactly.”
>
> Shannon, 1975

